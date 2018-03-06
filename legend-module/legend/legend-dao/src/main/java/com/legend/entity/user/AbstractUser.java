package com.legend.entity.user;

import com.legend.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author Administrator
 * @date 2018/2/17
 */
public class AbstractUser extends AbstractEntity<AbstractUser> {
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 状态（0、离线 1、在线）
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id id
     */
    public AbstractUser setId(Integer id) {
        this.id = id;
        return this;
    }

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
    public AbstractUser setUsername(String username) {
        this.username = username == null ? null : username.trim();
        return this;
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
    public AbstractUser setPassword(String password) {
        this.password = password == null ? null : password.trim();
        return this;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public AbstractUser setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
        return this;
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
    public AbstractUser setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
        return this;
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
    public AbstractUser setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
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
    public AbstractUser setStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public AbstractUser setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public AbstractUser setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public AbstractUser setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
}
