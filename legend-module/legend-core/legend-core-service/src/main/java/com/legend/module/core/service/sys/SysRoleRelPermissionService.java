package com.legend.module.core.service.sys;

import com.legend.module.core.entity.sys.SysRoleRelPermission;
import com.legend.module.core.service.core.LegendService;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/3
 */

public interface SysRoleRelPermissionService extends LegendService<SysRoleRelPermission> {

    /**
     * 根据系统角色ids查询
     *
     * @param ids 系统角色ids
     * @return SysRoleRelPermissions - 所有关联该角色的权限
     */
    List<SysRoleRelPermission> getListByRolesIds(List<Integer> ids);
}
