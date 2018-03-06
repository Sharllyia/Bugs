package com.legend.module.core.service.sys.impl;

import com.legend.module.core.entity.sys.SysRole;
import com.legend.module.core.entity.sys.SysRoleExample;
import com.legend.module.core.dao.mapper.sys.SysRoleMapper;
import com.legend.module.core.service.core.impl.AbstractLegendService;
import com.legend.module.core.service.sys.SysRoleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/3
 */
@Service
public class SysRoleServiceImpl extends AbstractLegendService<SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public Mapper<SysRole> getMapper() {
        return sysRoleMapper;
    }

    @Override
    protected Object getExample(SysRole sysRole, String order, String sort) {
        return null;
    }


    @Override
    public List<SysRole> getBySysRoleIds(List<Integer> ids) {
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andIdIn(ids);
        return getListByExample(example);
    }
}
