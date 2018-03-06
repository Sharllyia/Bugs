package com.legend.module.core.service.sys;

import com.legend.module.core.entity.sys.SysRole;
import com.legend.module.core.service.core.LegendService;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/3
 */
public interface SysRoleService extends LegendService<SysRole> {
    /**
     * 根据角色ids查询
     *
     * @param ids ids
     * @return sysRoles - 该用户关联的角色
     */
    List<SysRole> getBySysRoleIds(List<Integer> ids);
}
