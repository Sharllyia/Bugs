package com.legend.module.core.service.sys.impl;

import com.legend.module.core.entity.sys.SysRoleRelPermission;
import com.legend.module.core.entity.sys.SysRoleRelPermissionExample;
import com.legend.module.core.dao.mapper.sys.SysRoleRelPermissionMapper;
import com.legend.module.core.service.core.impl.AbstractLegendService;
import com.legend.module.core.service.sys.SysRoleRelPermissionService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/3
 */
@Service

public class SysRoleRelPermissionServiceImpl extends AbstractLegendService<SysRoleRelPermission> implements
        SysRoleRelPermissionService {

    @Resource
    private SysRoleRelPermissionMapper sysRoleRelPermissionMapper;

    @Override
    public Mapper<SysRoleRelPermission> getMapper() {
        return sysRoleRelPermissionMapper;
    }

    @Override
    protected Object getExample(SysRoleRelPermission sysRoleRelPermission, String order, String sort) {
        return null;
    }

    @Override
    public List<SysRoleRelPermission> getListByRolesIds(List<Integer> ids) {
        SysRoleRelPermissionExample example = new SysRoleRelPermissionExample();
        example.setDistinct(true);
        example.createCriteria().andSysRoleIdIn(ids);
        return getListByExample(example);
    }
}
