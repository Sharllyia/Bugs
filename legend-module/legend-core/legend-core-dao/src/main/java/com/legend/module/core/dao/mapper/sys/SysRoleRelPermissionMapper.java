package com.legend.module.core.dao.mapper.sys;

import com.legend.module.core.dao.mapper.core.LegendMapper;
import com.legend.module.core.entity.sys.SysRoleRelPermission;
import com.legend.module.core.entity.sys.SysRoleRelPermissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SysRoleRelPermissionMapper extends LegendMapper<SysRoleRelPermission> {
    int countByExample(SysRoleRelPermissionExample example);
}