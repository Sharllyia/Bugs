package com.legend.module.core.entity.sys;

import com.legend.module.core.entity.AbstractEntity;
import javax.persistence.*;

@Table(name = "sys_user_rel_role")
public class SysUserRelRole extends AbstractEntity {
    /**
     * 关联id
     */
    @Id
    private Integer id;

    /**
     * 系统用户id
     */
    @Column(name = "sys_user_id")
    private Integer sysUserId;

    /**
     * 系统角色id
     */
    @Column(name = "sys_role_id")
    private Integer sysRoleId;

    /**
     * 获取关联id
     *
     * @return id - 关联id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置关联id
     *
     * @param id 关联id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取系统用户id
     *
     * @return sys_user_id - 系统用户id
     */
    public Integer getSysUserId() {
        return sysUserId;
    }

    /**
     * 设置系统用户id
     *
     * @param sysUserId 系统用户id
     */
    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取系统角色id
     *
     * @return sys_role_id - 系统角色id
     */
    public Integer getSysRoleId() {
        return sysRoleId;
    }

    /**
     * 设置系统角色id
     *
     * @param sysRoleId 系统角色id
     */
    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }
}