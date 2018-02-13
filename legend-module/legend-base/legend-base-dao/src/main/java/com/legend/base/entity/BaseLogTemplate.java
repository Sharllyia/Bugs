package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import javax.persistence.*;

@Table(name = "base_log_template")
public class BaseLogTemplate extends BaseEntity {
    /**
     * 系统日志模板内容
     */
    private String template;

    /**
     * 获取系统日志模板内容
     *
     * @return template - 系统日志模板内容
     */
    public String getTemplate() {
        return template;
    }

    /**
     * 设置系统日志模板内容
     *
     * @param template 系统日志模板内容
     */
    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }
}