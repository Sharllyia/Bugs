package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_log_record")
public class BaseLogRecord extends BaseEntity {
    /**
     * 系统日志记录操作用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 系统日志记录操作用户类型（0、前台 1、后台）
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 系统日志记录操作表名
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 系统日志记录操作数据id
     */
    @Column(name = "data_id")
    private Integer dataId;

    /**
     * 系统日志记录操作用户ip地址
     */
    private String ip;

    /**
     * 系统日志记录备注
     */
    private String remark;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 更新时间
     */
    @Column(name = "upate_time")
    private Date upateTime;

    /**
     * 系统日志记录内容
     */
    private String content;

    /**
     * 获取系统日志记录操作用户id
     *
     * @return user_id - 系统日志记录操作用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置系统日志记录操作用户id
     *
     * @param userId 系统日志记录操作用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取系统日志记录操作用户类型（0、前台 1、后台）
     *
     * @return user_type - 系统日志记录操作用户类型（0、前台 1、后台）
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置系统日志记录操作用户类型（0、前台 1、后台）
     *
     * @param userType 系统日志记录操作用户类型（0、前台 1、后台）
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取系统日志记录操作表名
     *
     * @return table_name - 系统日志记录操作表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置系统日志记录操作表名
     *
     * @param tableName 系统日志记录操作表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 获取系统日志记录操作数据id
     *
     * @return data_id - 系统日志记录操作数据id
     */
    public Integer getDataId() {
        return dataId;
    }

    /**
     * 设置系统日志记录操作数据id
     *
     * @param dataId 系统日志记录操作数据id
     */
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    /**
     * 获取系统日志记录操作用户ip地址
     *
     * @return ip - 系统日志记录操作用户ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置系统日志记录操作用户ip地址
     *
     * @param ip 系统日志记录操作用户ip地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取系统日志记录备注
     *
     * @return remark - 系统日志记录备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置系统日志记录备注
     *
     * @param remark 系统日志记录备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取更新时间
     *
     * @return upate_time - 更新时间
     */
    public Date getUpateTime() {
        return upateTime;
    }

    /**
     * 设置更新时间
     *
     * @param upateTime 更新时间
     */
    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    /**
     * 获取系统日志记录内容
     *
     * @return content - 系统日志记录内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置系统日志记录内容
     *
     * @param content 系统日志记录内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}