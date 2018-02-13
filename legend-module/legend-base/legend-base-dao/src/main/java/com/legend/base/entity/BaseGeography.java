package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import javax.persistence.*;

@Table(name = "base_geography")
public class BaseGeography extends BaseEntity {
    /**
     * 地理位置排序
     */
    private Integer sort;

    /**
     * 地理位置父级id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 地理位置等级
     */
    private Integer level;

    /**
     * 地理位置名称
     */
    private String name;

    /**
     * 地理位置简称
     */
    @Column(name = "short_name")
    private String shortName;

    /**
     * 地理位置经度
     */
    private Double longitude;

    /**
     * 地理位置纬度
     */
    private Double latitude;

    /**
     * 地理位置标识
     */
    private String sign;

    /**
     * 获取地理位置排序
     *
     * @return sort - 地理位置排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置地理位置排序
     *
     * @param sort 地理位置排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取地理位置父级id
     *
     * @return parent_id - 地理位置父级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置地理位置父级id
     *
     * @param parentId 地理位置父级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取地理位置等级
     *
     * @return level - 地理位置等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置地理位置等级
     *
     * @param level 地理位置等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取地理位置名称
     *
     * @return name - 地理位置名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置地理位置名称
     *
     * @param name 地理位置名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取地理位置简称
     *
     * @return short_name - 地理位置简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置地理位置简称
     *
     * @param shortName 地理位置简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * 获取地理位置经度
     *
     * @return longitude - 地理位置经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置地理位置经度
     *
     * @param longitude 地理位置经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取地理位置纬度
     *
     * @return latitude - 地理位置纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置地理位置纬度
     *
     * @param latitude 地理位置纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取地理位置标识
     *
     * @return sign - 地理位置标识
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置地理位置标识
     *
     * @param sign 地理位置标识
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }
}