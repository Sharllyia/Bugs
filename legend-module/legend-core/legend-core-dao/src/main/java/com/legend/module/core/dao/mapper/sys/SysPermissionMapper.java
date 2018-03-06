package com.legend.module.core.dao.mapper.sys;

import com.legend.module.core.dao.mapper.core.LegendMapper;
import com.legend.module.core.entity.sys.SysPermission;
import com.legend.module.core.entity.sys.SysPermissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SysPermissionMapper extends LegendMapper<SysPermission> {
    int countByExample(SysPermissionExample example);
}