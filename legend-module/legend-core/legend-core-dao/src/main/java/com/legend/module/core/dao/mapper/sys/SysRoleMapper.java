package com.legend.module.core.dao.mapper.sys;

import com.legend.module.core.dao.mapper.core.LegendMapper;
import com.legend.module.core.entity.sys.SysRole;
import com.legend.module.core.entity.sys.SysRoleExample;

public interface SysRoleMapper extends LegendMapper<SysRole> {
    int countByExample(SysRoleExample example);
}