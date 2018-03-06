package com.legend.module.core.dao.mapper.sys;

import com.legend.module.core.dao.mapper.core.LegendMapper;
import com.legend.module.core.entity.sys.SysUser;
import com.legend.module.core.entity.sys.SysUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SysUserMapper extends LegendMapper<SysUser> {
    int countByExample(SysUserExample example);
}