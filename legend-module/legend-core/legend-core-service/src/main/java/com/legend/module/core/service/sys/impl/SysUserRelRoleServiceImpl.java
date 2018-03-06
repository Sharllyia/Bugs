package com.legend.module.core.service.sys.impl;

import com.legend.module.core.entity.sys.SysUserRelRole;
import com.legend.module.core.dao.mapper.sys.SysUserRelRoleMapper;
import com.legend.module.core.service.core.impl.AbstractLegendService;
import com.legend.module.core.service.sys.SysUserRelRoleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/3
 */
@Service

public class SysUserRelRoleServiceImpl extends AbstractLegendService<SysUserRelRole> implements SysUserRelRoleService {

    @Resource
    private SysUserRelRoleMapper sysUserRelRoleMapper;

    @Override
    public Mapper<SysUserRelRole> getMapper() {
        return sysUserRelRoleMapper;
    }

    @Override
    protected Object getExample(SysUserRelRole sysUserRelRole, String order, String sort) {
        return null;
    }


    @Override
    public List<SysUserRelRole> getListBySysUserId(int id) {
        SysUserRelRole sysUserRelRole = new SysUserRelRole();
        sysUserRelRole.setSysUserId(id);
        return getList(sysUserRelRole);
    }
}
