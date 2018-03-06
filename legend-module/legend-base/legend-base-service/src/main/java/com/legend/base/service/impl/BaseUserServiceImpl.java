package com.legend.base.service.impl;

import com.legend.base.dao.mapper.base.BaseUserMapper;
import com.legend.base.entity.base.BaseUser;
import com.legend.base.entity.base.BaseUserExample;
import com.legend.base.service.BaseUserService;
import com.legend.service.impl.AbstractService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2018/2/15
 */
@Service
public class BaseUserServiceImpl extends AbstractService<BaseUser> implements BaseUserService {

    @Resource
    private BaseUserMapper baseUserMapper;

    @Override
    public Mapper<BaseUser> getMapper() {
        return baseUserMapper;
    }

    @Override
    protected Object getExample(BaseUser baseUser, String order, String sort) {
        BaseUserExample example = new BaseUserExample();
        if (StringUtils.isNotBlank(order)) {
            if (StringUtils.isNotBlank(sort)) {
                order = order.concat(" ").concat(sort);
            }
            example.setOrderByClause(order);
        }
        // 默认操作为is_deleted = false
        BaseUserExample.Criteria criteria = example.createCriteria().andIsDeletedEqualTo(false);
        if (baseUser == null) {
            return example;
        }
        if (baseUser.getId() != null) {
            criteria.andIdEqualTo(baseUser.getId());
        }
        if (baseUser.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(baseUser.getCreateTime());
        }
        if (baseUser.getUpdateTime() != null) {
            criteria.andUpdateTimeEqualTo(baseUser.getUpdateTime());
        }
        if (baseUser.getIsDeleted() != null) {
            criteria.andIsDeletedEqualTo(baseUser.getIsDeleted());
        }
        return example;
    }

    @Override
    public BaseUser getByUserName(String username) {
        BaseUser baseUser = new BaseUser();
        baseUser.setUsername(username);
        return get(baseUser);
    }
}
