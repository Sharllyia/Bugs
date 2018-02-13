package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import javax.persistence.*;

@Table(name = "base_banner")
public class BaseBanner extends BaseEntity {
    /**
     * 轮播图排序
     */
    private Integer sort;

    /**
     * 轮播图名称
     */
    private String name;

    /**
     * 轮播图url
     */
    @Column(name = "picture_url")
    private String pictureUrl;

    /**
     * 轮播图链接
     */
    private String link;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 获取轮播图排序
     *
     * @return sort - 轮播图排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置轮播图排序
     *
     * @param sort 轮播图排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取轮播图名称
     *
     * @return name - 轮播图名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置轮播图名称
     *
     * @param name 轮播图名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取轮播图url
     *
     * @return picture_url - 轮播图url
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置轮播图url
     *
     * @param pictureUrl 轮播图url
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    /**
     * 获取轮播图链接
     *
     * @return link - 轮播图链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置轮播图链接
     *
     * @param link 轮播图链接
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
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
}