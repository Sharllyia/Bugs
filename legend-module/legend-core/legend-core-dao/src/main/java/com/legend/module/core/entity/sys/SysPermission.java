package com.legend.module.core.entity.sys;

import com.legend.module.core.entity.AbstractEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_permission")
public class SysPermission extends AbstractEntity {
    /**
     * 权限id
     */
    @Id
    private Integer id;

    /**
     * 权限名称
     */
    @Column(name = "permission_name")
    private String permissionName;

    /**
     * 标识
     */
    private String sign;

    /**
     * 描述
     */
    private String description;

    /**
     * 资源
     */
    private String url;

    /**
     * 父级权限id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 排序
     */
    private Integer sort;

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
     * 获取权限id
     *
     * @return id - 权限id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置权限id
     *
     * @param id 权限id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限名称
     *
     * @return permission_name - 权限名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 设置权限名称
     *
     * @param permissionName 权限名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * 获取标识
     *
     * @return sign - 标识
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置标识
     *
     * @param sign 标识
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取资源
     *
     * @return url - 资源
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源
     *
     * @param url 资源
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取父级权限id
     *
     * @return parent_id - 父级权限id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级权限id
     *
     * @param parentId 父级权限id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}