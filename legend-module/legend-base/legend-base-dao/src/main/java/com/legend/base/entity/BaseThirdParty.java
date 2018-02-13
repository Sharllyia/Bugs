package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import javax.persistence.*;

@Table(name = "base_third_party")
public class BaseThirdParty extends BaseEntity {
    /**
     * 前台用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 第三方信息id
     */
    @Column(name = "third_id")
    private String thirdId;

    /**
     * 第三方信息访问令牌
     */
    @Column(name = "third_access_token")
    private String thirdAccessToken;

    /**
     * 第三方平台
     */
    @Column(name = "platform_type")
    private Integer platformType;

    /**
     * 获取前台用户id
     *
     * @return user_id - 前台用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置前台用户id
     *
     * @param userId 前台用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取第三方信息id
     *
     * @return third_id - 第三方信息id
     */
    public String getThirdId() {
        return thirdId;
    }

    /**
     * 设置第三方信息id
     *
     * @param thirdId 第三方信息id
     */
    public void setThirdId(String thirdId) {
        this.thirdId = thirdId == null ? null : thirdId.trim();
    }

    /**
     * 获取第三方信息访问令牌
     *
     * @return third_access_token - 第三方信息访问令牌
     */
    public String getThirdAccessToken() {
        return thirdAccessToken;
    }

    /**
     * 设置第三方信息访问令牌
     *
     * @param thirdAccessToken 第三方信息访问令牌
     */
    public void setThirdAccessToken(String thirdAccessToken) {
        this.thirdAccessToken = thirdAccessToken == null ? null : thirdAccessToken.trim();
    }

    /**
     * 获取第三方平台
     *
     * @return platform_type - 第三方平台
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置第三方平台
     *
     * @param platformType 第三方平台
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }
}