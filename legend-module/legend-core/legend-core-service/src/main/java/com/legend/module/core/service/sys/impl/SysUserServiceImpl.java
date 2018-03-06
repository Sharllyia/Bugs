package com.legend.module.core.service.sys.impl;

import com.legend.module.core.entity.sys.SysUser;
import com.legend.module.core.entity.sys.SysUserExample;
import com.legend.module.core.dao.mapper.sys.SysUserMapper;
import com.legend.module.core.service.core.impl.AbstractLegendService;
import com.legend.module.core.service.sys.SysUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2018/3/1
 */
@Service
public class SysUserServiceImpl extends AbstractLegendService<SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public Mapper<SysUser> getMapper() {
        return sysUserMapper;
    }

    @Override
    protected Object getExample(SysUser sysUser, String order, String sort) {
        SysUserExample example = new SysUserExample();
        if (StringUtils.isNotBlank(order)) {
            if (StringUtils.isNotBlank(sort)) {
                order = order.concat(" ").concat(sort);
            }
            example.setOrderByClause(order);
        }
        SysUserExample.Criteria criteria = example.createCriteria().andIsDeletedEqualTo(false);
        if (sysUser == null) {
            return example;
        }
        if (sysUser.getId() != null) {
            criteria.andIdEqualTo(sysUser.getId());
        }
        if (sysUser.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(sysUser.getCreateTime());
        }
        if (sysUser.getUpdateTime() != null) {
            criteria.andUpdateTimeEqualTo(sysUser.getUpdateTime());
        }
        if (sysUser.getIsDeleted() != null) {
            criteria.andIsDeletedEqualTo(sysUser.getIsDeleted());
        }
        return example;
    }


    @Override
    public SysUser getByUsername(String name) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(name);
        return get(sysUser);
    }
}
