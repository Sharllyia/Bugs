package com.legend.module.core.dao.mapper.sys;

import com.legend.module.core.dao.mapper.core.LegendMapper;
import com.legend.module.core.entity.sys.SysUserRelRole;
import com.legend.module.core.entity.sys.SysUserRelRoleExample;

public interface SysUserRelRoleMapper extends LegendMapper<SysUserRelRole> {
    int countByExample(SysUserRelRoleExample example);
}