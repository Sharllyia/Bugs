package com.legend.web.controller.website.user;

import com.legend.entity.user.AbstractUser;
import com.legend.model.contant.arribute.Key;
import com.legend.model.contant.code.result.user.UserResultCode;
import com.legend.model.contant.message.result.user.UserResultMessage;
import com.legend.model.group.user.AccountLoginGroup;
import com.legend.model.group.user.PhoneLoginGroup;
import com.legend.model.group.user.RegisterGroup;
import com.legend.model.json.result.Ajax;
import com.legend.model.json.result.AjaxValidate;
import com.legend.model.json.result.Error;
import com.legend.service.user.UserService;
import com.legend.utils.HttpSessionUtils;
import com.legend.vo.user.AbstractUserVO;
import com.legend.web.controller.website.AbstractWebsiteController;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.HibernateValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

/**
 * @author Administrator
 * @date 2018/2/2
 */
@Component
public abstract class AbstractUserController<T extends AbstractUser, TVO extends AbstractUserVO> extends
        AbstractWebsiteController {

    private static final Validator VALIDATOR = Validation.byProvider(HibernateValidator.class).configure().failFast
            (false).buildValidatorFactory().getValidator();

    @Resource
    private UserService userService;

    /**
     * 登录成功后的操作，如无特殊需求可忽视
     * <p>
     * 允许在子类重写方法
     * </p>
     */
    protected abstract void loginProcess();

    /**
     * 登出成功后的操作，如无特殊需求可忽视
     * <p>
     * 允许在子类重写方法
     * </p>
     */
    protected abstract void logoutProcess();

    /**
     * 注册成功后的操作，如无特殊需求可忽视
     * <p>
     * 允许在子类重写方法
     * </p>
     */
    protected abstract void registerProcess();

    /**
     * 修改密码成功后的操作，如无特殊需求可忽视
     * <p>
     * 允许在子类重写方法
     * </p>
     */
    protected abstract void updatePasswordProess();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Ajax login(TVO tvo) {
        if (tvo == null) {
            return null;
        }

        Ajax ajax = checkUser(tvo);
        if ((Boolean) ajax.get(Key.RESULT)) {
            return ajax;
        }
        return Ajax.success(UserResultMessage.LOGIN_SUCCESS);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.PUT)
    @ResponseBody
    public Ajax logout(TVO tvo) {
        logoutProcess();
        return null;
    }

    @RequestMapping("/image/")
    @ResponseBody
    public Ajax imageCode(String code) {
        return null;
    }

    @RequestMapping("/sms")
    @ResponseBody
    public Ajax sendSMS(String phone) {
        return null;
    }

    @RequestMapping("/sms/")
    @ResponseBody
    public Ajax smsCode(String code) {
        return null;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Ajax register(@Validated({RegisterGroup.class}) TVO tvo, BindingResult bindingResult) {
        return null;
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ResponseBody
    public Ajax updatePassword() {
        return null;
    }

    /**
     * 验证图片验证码
     *
     * @param code 图片验证码
     * @return true or false
     */
    protected Error checkImageCode(String code) {
        if (StringUtils.isBlank(code)) {
            return new Error(UserResultMessage.IMAGE_CODE_IS_BLANK, UserResultCode.IMAGE_CODE_IS_BLANK);
        }
        String imageCode = String.valueOf(HttpSessionUtils.getAttribute(Key.IMAGECODE));
        if (StringUtils.isBlank(imageCode)) {
            return new Error(UserResultMessage.IMAGE_CODE_NOT_EXIST, UserResultCode.IMAGE_CODE_NOT_EXIST);
        }
        return imageCode.equals(code) ? null : new Error(UserResultMessage.IMAGE_CODE_WRONG, UserResultCode.IMAGE_CODE_WRONG);
    }

    /**
     * 验证短信验证码
     * <p>
     * 允许在子类重写验证方法
     * </p>
     *
     * @param code 短信验证码
     * @return true or false
     */
    protected Error checkSMSCode(String code) {
        if (StringUtils.isBlank(code)) {
            return new Error(UserResultMessage.SMS_CODE_IS_BLANK, UserResultCode.SMS_CODE_IS_BLANK);
        }
        String smsCode = String.valueOf(HttpSessionUtils.getAttribute(Key.SMSCODE));
        if (StringUtils.isBlank(smsCode)) {
            return new Error(UserResultMessage.SMS_CODE_NOT_SENT, UserResultCode.SMS_CODE_NOT_SENT);
        }
        return smsCode.equals(code) ? null : new Error(UserResultMessage.SMS_CODE_WRONG, UserResultCode.SMS_CODE_WRONG);
    }

    /**
     * 验证手机号是否相同
     * <p>
     * 允许在子类重写验证方法
     * </p>
     *
     * @param phone 手机号
     * @return true or false
     */
    protected Error checkPhone(String phone) {
        if (StringUtils.isBlank(phone)) {
            return new Error(UserResultMessage.PHONE_IS_BLANK, UserResultCode.PASSWORD_IS_BLANK);
        }
        String phone1 = String.valueOf(HttpSessionUtils.getAttribute(Key.PHONE));
        if (StringUtils.isBlank(phone1)) {
            return new Error(UserResultMessage.SMS_CODE_NOT_SENT, UserResultCode.SMS_CODE_NOT_SENT);
        }
        return phone.equals(phone1) ? null : new Error(UserResultMessage.PHONE_WRONG, UserResultCode.PHONE_WRONG);
    }

    /**
     * 验证用户信息有效性
     *
     * @param tvo tvo
     * @return Ajax
     */
    private Ajax checkUser(TVO tvo) {
        if (getCurrentUser() != null) {
            return Ajax.success(UserResultMessage.LOGIN_SUCCESS);
        }
        Error error;
        if (tvo.getAutoLogin()) {
            if (StringUtils.isBlank(tvo.getPassword())) {
                if ((error = validatePhoneLogin(tvo)) != null) {
                    return Ajax.error(error);
                }
                if ((error = checkPhone(tvo.getPhone())) != null) {
                    return Ajax.error(error);
                }
                if ((error = checkSMSCode(tvo.getSmsCode())) != null) {
                    return Ajax.error(error);
                }
                if (userService.getByPhone(tvo.getPhone()) == null) {
                    return Ajax.error(UserResultMessage.USER_NOT_EXIST, UserResultCode.USER_NOT_EXIST);
                }
            } else {
                if ((error = validateAccountLogin(tvo)) != null) {
                    return Ajax.error(error);
                }
                if ((error = checkImageCode(tvo.getImageCode())) != null) {
                    return Ajax.error(error);
                }
                if (userService.getByUsernameAndPassword(tvo.getUsername(), tvo.getPassword()) == null) {
                    return Ajax.error(UserResultMessage.USER_NOT_EXIST, UserResultCode.USER_NOT_EXIST);
                }
            }
        }
        loginProcess();
        return Ajax.success(UserResultMessage.LOGIN_SUCCESS);
    }

    /**
     * 可以在子类自定义手机号登录验证逻辑
     * <p>
     * 允许在子类重写验证方法
     * </p>
     *
     * @param tvo tvo
     * @return error
     */
    protected Error validatePhoneLogin(TVO tvo) {
        return validateLogin(tvo, PhoneLoginGroup.class);
    }

    /**
     * 可以在子类自定义用户名登录验证逻辑
     * <p>
     * 允许在子类重写验证方法
     * </p>
     *
     * @param tvo tvo
     * @return error
     */
    protected Error validateAccountLogin(TVO tvo) {
        return validateLogin(tvo, AccountLoginGroup.class);
    }

    /**
     * 默认的登录验证
     *
     * @param tvo   tvo
     * @param group 验证分组
     * @return error
     */
    private Error validateLogin(TVO tvo, Class<?> group) {
        Set<ConstraintViolation<TVO>> violationSet;
        if ((violationSet = VALIDATOR.validate(tvo, group)).isEmpty()) {
            return null;
        }
        List<Error> errors = AjaxValidate.validate(violationSet);
        if (errors.isEmpty()) {
            return null;
        }
        return errors.get(0);
    }


}
