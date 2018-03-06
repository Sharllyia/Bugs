package com.legend.module.core.entity.sys;

import com.legend.module.core.entity.AbstractEntity;
import javax.persistence.*;

@Table(name = "sys_role_rel_permission")
public class SysRoleRelPermission extends AbstractEntity {
    /**
     * 关联id
     */
    @Id
    private Integer id;

    /**
     * 系统角色id
     */
    @Column(name = "sys_role_id")
    private Integer sysRoleId;

    /**
     * 系统权限id
     */
    @Column(name = "sys_permission_id")
    private Integer sysPermissionId;

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

    /**
     * 获取系统权限id
     *
     * @return sys_permission_id - 系统权限id
     */
    public Integer getSysPermissionId() {
        return sysPermissionId;
    }

    /**
     * 设置系统权限id
     *
     * @param sysPermissionId 系统权限id
     */
    public void setSysPermissionId(Integer sysPermissionId) {
        this.sysPermissionId = sysPermissionId;
    }
}