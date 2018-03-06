package com.legend.module.core.service.sys;

import com.legend.module.core.entity.sys.SysUserRelRole;
import com.legend.module.core.service.core.LegendService;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/3
 */
public interface SysUserRelRoleService extends LegendService<SysUserRelRole> {

    /**
     * 根据系统用户id查询所有关联该用户的角色
     *
     * @param id 用户id
     * @return sysUserRelRoles - 所有关联该用户的角色
     */
    List<SysUserRelRole> getListBySysUserId(int id);

}
