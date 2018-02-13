package com.legend.base.web.controller.website;

import com.legend.base.entity.BaseUser;
import com.legend.base.model.contant.arribute.Key;
import com.legend.base.model.contant.code.result.BaseAjaxCode;
import com.legend.base.model.contant.code.result.base.BaseUserResultCode;
import com.legend.base.model.contant.message.result.BaseAjaxMessage;
import com.legend.base.model.contant.message.result.base.BaseUserResultMessage;
import com.legend.base.model.group.Base;
import com.legend.base.model.group.base.PasswordGroup;
import com.legend.base.model.json.result.Ajax;
import com.legend.base.model.json.result.AjaxValidate;
import com.legend.base.model.json.result.Error;
import com.legend.base.utils.HttpSessionUtils;
import com.legend.base.vo.BaseUserVO;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.HibernateValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class AbstractUserController<T extends BaseUser, TVO extends BaseUserVO> extends WebsiteBaseController {

    protected static final Validator VALIDATOR = Validation.byProvider(HibernateValidator.class).configure().failFast
            (false).buildValidatorFactory().getValidator();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Ajax login(TVO tvo) {
        Set<ConstraintViolation<TVO>> violationSet = null;
        if (tvo == null) {
            return null;
        }
        // PasswordGroup.class 仅负责password字段的验证
        violationSet = VALIDATOR.validate(tvo, PasswordGroup.class);
        if (!violationSet.isEmpty()) {
            List<Error> errors = AjaxValidate.validate(violationSet);
            Error error = new Error(BaseAjaxMessage.VALIDATE_FAULT, BaseAjaxCode.VALIDATE_FAULT);
            if (errors != null) {
                error = errors.get(0);
            }
            return Ajax.error(error);
        }
        if (!checkImageCode(tvo.getImageCode())){

        }
        if (!checkSMSCode(tvo.getSmsCode())){

        }



        return null;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.PUT)
    @ResponseBody
    public Ajax logout(TVO tvo) {
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
    public Ajax register(@Validated({Base.class}) TVO tvo, BindingResult bindingResult) {
        return null;
    }

    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    @ResponseBody
    public Ajax updatePassword() {
        return null;
    }

    private boolean checkImageCode(String code){
        String imageCode = String.valueOf(HttpSessionUtils.getAttribute(Key.IMAGECODE));
        return !StringUtils.isBlank(imageCode) && imageCode.equals(code);
    }

    private boolean checkSMSCode(String code) {
        String smsCode = String.valueOf(HttpSessionUtils.getAttribute(Key.SMSCODE));
        return !StringUtils.isBlank(smsCode) && smsCode.equals(code);
    }
}
