package com.legend.module.core.service.sys.impl;

import com.legend.module.core.entity.sys.SysPermission;
import com.legend.module.core.entity.sys.SysPermissionExample;
import com.legend.module.core.dao.mapper.sys.SysPermissionMapper;
import com.legend.module.core.service.core.impl.AbstractLegendService;
import com.legend.module.core.service.sys.SysPermissionService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/1
 */
@Service
public class SysPermissionServiceImpl extends AbstractLegendService<SysPermission> implements SysPermissionService {

    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public Mapper<SysPermission> getMapper() {
        return sysPermissionMapper;
    }

    @Override
    protected Object getExample(SysPermission sysPermission, String order, String sort) {
        return null;
    }

    @Override
    public List<SysPermission> getListByIds(List<Integer> ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.setDistinct(true);
        example.createCriteria().andIdIn(ids);
        return getListByExample(example);
    }

}
