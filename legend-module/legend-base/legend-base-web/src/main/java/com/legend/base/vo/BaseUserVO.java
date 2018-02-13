package com.legend.base.vo;

import com.legend.base.bo.BaseUserBO;
import com.legend.base.model.contant.message.result.base.BaseUserResultMessage;
import com.legend.base.model.group.base.LoginGroup;
import com.legend.base.model.group.base.RegisterGroup;
import com.legend.base.model.group.base.PasswordGroup;
import com.legend.base.model.pojo.vo.BaseVO;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author Administrator
 * @date 2018/2/1
 */
public class BaseUserVO extends BaseVO<BaseUserVO, BaseUserBO> {

    /**
     * 用户名
     */
    @NotBlank(message = BaseUserResultMessage.USERNAME_IS_BLANK, groups = {LoginGroup.class, RegisterGroup.class,
            PasswordGroup.class})
    @Length(min = 6, message = BaseUserResultMessage.PASSWORD_LENGTH_MIN, groups = {LoginGroup.class, RegisterGroup
            .class, PasswordGroup.class})
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = BaseUserResultMessage.PASSWORD_IS_BLANK, groups = {LoginGroup.class, RegisterGroup.class,
            PasswordGroup.class})
    @Length(min = 6, message = BaseUserResultMessage.PASSWORD_LENGTH_MIN, groups = {LoginGroup.class, RegisterGroup
            .class, PasswordGroup.class})
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 图片验证码
     */
    private String imageCode;

    /**
     * 手机短信验证码
     */
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
    protected void parseProcess(BaseUserVO baseUserVO) {

    }
}
