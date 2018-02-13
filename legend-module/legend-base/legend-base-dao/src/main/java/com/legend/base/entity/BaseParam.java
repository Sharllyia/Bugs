package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import javax.persistence.*;

@Table(name = "base_param")
public class BaseParam extends BaseEntity {
    /**
     * 系统参数名称
     */
    private String name;

    /**
     * 系统参数描述
     */
    private String description;

    /**
     * 系统参数值
     */
    private String param;

    /**
     * 系统参数值
     */
    private Integer value;

    /**
     * 系统参数标识
     */
    private String sign;

    /**
     * 获取系统参数名称
     *
     * @return name - 系统参数名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置系统参数名称
     *
     * @param name 系统参数名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取系统参数描述
     *
     * @return description - 系统参数描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置系统参数描述
     *
     * @param description 系统参数描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取系统参数值
     *
     * @return param - 系统参数值
     */
    public String getParam() {
        return param;
    }

    /**
     * 设置系统参数值
     *
     * @param param 系统参数值
     */
    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    /**
     * 获取系统参数值
     *
     * @return value - 系统参数值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置系统参数值
     *
     * @param value 系统参数值
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取系统参数标识
     *
     * @return sign - 系统参数标识
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置系统参数标识
     *
     * @param sign 系统参数标识
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }
}