package com.legend.module.core.service.sys;

import com.legend.module.core.entity.sys.SysPermission;
import com.legend.module.core.service.core.LegendService;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/1
 */
public interface SysPermissionService extends LegendService<SysPermission> {

    /**
     * 根据权限ids查询
     *
     * @param ids ids
     * @return sysPermission - 符合条件的权限
     */
    List<SysPermission> getListByIds(List<Integer> ids);
}
