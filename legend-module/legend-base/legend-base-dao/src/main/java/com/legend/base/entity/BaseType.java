package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import javax.persistence.*;

@Table(name = "base_type")
public class BaseType extends BaseEntity {
    /**
     * 基础类型名称
     */
    private String name;

    /**
     * 基础类型值
     */
    private Integer value;

    /**
     * 基础类型描述
     */
    private String description;

    /**
     * 基础类型标识
     */
    private String sign;

    /**
     * 获取基础类型名称
     *
     * @return name - 基础类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置基础类型名称
     *
     * @param name 基础类型名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取基础类型值
     *
     * @return value - 基础类型值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置基础类型值
     *
     * @param value 基础类型值
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取基础类型描述
     *
     * @return description - 基础类型描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置基础类型描述
     *
     * @param description 基础类型描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取基础类型标识
     *
     * @return sign - 基础类型标识
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置基础类型标识
     *
     * @param sign 基础类型标识
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }
}