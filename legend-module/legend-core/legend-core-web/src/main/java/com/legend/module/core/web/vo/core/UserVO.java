package com.legend.module.core.web.vo.core;

import com.legend.module.core.model.contant.message.result.user.UserResultMessage;
import com.legend.module.core.model.contant.regex.Regexp;
import com.legend.module.core.model.group.user.AccountLoginGroup;
import com.legend.module.core.model.group.user.PhoneLoginGroup;
import com.legend.module.core.model.group.user.RegisterGroup;
import com.legend.module.core.model.group.user.UpdatePasswordGroup;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @author Administrator
 * @date 2018/3/5
 */
public class UserVO extends AbstractVO<UserVO> {


    /**
     * 用户名
     */
    @NotBlank(message = UserResultMessage.USERNAME_IS_BLANK, groups = {AccountLoginGroup.class, RegisterGroup.class,
            UpdatePasswordGroup.class})
    @Length(min = 6, message = UserResultMessage.PASSWORD_LENGTH_MIN, groups = {AccountLoginGroup.class, RegisterGroup
            .class, UpdatePasswordGroup.class})
    private String username;

    /**
     * 手机号
     */
    @NotBlank(message = UserResultMessage.PHONE_IS_BLANK, groups = {PhoneLoginGroup.class})
    @Pattern(regexp = Regexp.PHONE, message = UserResultMessage.PHONE_WRONG,
            groups = {PhoneLoginGroup.class})
    private String phone;

    /**
     * 密码
     */
    @NotBlank(message = UserResultMessage.PASSWORD_IS_BLANK, groups = {AccountLoginGroup.class, RegisterGroup.class,
            UpdatePasswordGroup.class})
    @Length(min = 6, message = UserResultMessage.PASSWORD_LENGTH_MIN, groups = {AccountLoginGroup.class, RegisterGroup
            .class, UpdatePasswordGroup.class})
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 图片验证码
     */
    @NotNull(message = UserResultMessage.IMAGE_CODE_IS_BLANK, groups = {RegisterGroup.class})
    @Length(min = 4, max = 4, message = UserResultMessage.IMAGE_CODE_WRONG, groups = {RegisterGroup.class})
    private String imageCode;

    /**
     * 判断是否是自动登录
     */
    private Boolean isAutoLogin;

    /**
     * 手机短信验证码
     */
    @NotNull(message = UserResultMessage.SMS_CODE_IS_BLANK, groups = {RegisterGroup.class, PhoneLoginGroup.class})
    @Length(min = 4, max = 4, message = UserResultMessage.SMS_CODE_WRONG, groups = {RegisterGroup.class, PhoneLoginGroup.class})
    private String smsCode;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 状态（0、离线 1、在线）
     */
    private Integer status;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取图片验证码
     *
     * @return imageCode 图片验证码
     */
    public String getImageCode() {
        return imageCode;
    }

    /**
     * 设置图片验证码
     *
     * @param imageCode 图片验证码
     */
    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    /**
     * 获取是否自动登录
     *
     * @return isAutoLogin 是否自动登录
     */
    public Boolean getAutoLogin() {
        return isAutoLogin;
    }

    /**
     * 设置是否自动登录
     *
     * @param autoLogin 是否自动登录
     */
    public void setAutoLogin(Boolean autoLogin) {
        isAutoLogin = autoLogin;
    }

    /**
     * 获取手机短信验证码
     *
     * @return smsCode 手机短信验证码
     */
    public String getSmsCode() {
        return smsCode;
    }

    /**
     * 设置手机短信验证码
     *
     * @param smsCode 手机短信验证码
     */
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取状态（0、离线 1、在线）
     *
     * @return status - 状态（0、离线 1、在线）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0、离线 1、在线）
     *
     * @param status 状态（0、离线 1、在线）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否启用
     *
     * @return is_enabled - 是否启用
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用
     *
     * @param isEnabled 是否启用
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    protected void parseProcess(UserVO userVO) {

    }
}
