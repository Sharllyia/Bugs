package com.legend.service.user.impl;

import com.legend.dao.mapper.user.UserMapper;
import com.legend.entity.user.AbstractUser;
import com.legend.entity.user.AbstractUserExample;
import com.legend.service.impl.AbstractService;
import com.legend.service.user.UserService;
import org.apache.commons.lang.StringUtils;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2018/2/17
 */
public class UserServiceImpl extends AbstractService<AbstractUser> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Mapper<AbstractUser> getMapper() {
        return userMapper;
    }

    @Override
    protected Object getExample(AbstractUser abstractUser, String order, String sort) {
        AbstractUserExample example = new AbstractUserExample();
        if (StringUtils.isNotBlank(order)) {
            if (StringUtils.isNotBlank(sort)) {
                order = order.concat(" ").concat(sort);
            }
            example.setOrderByClause(order);
        }
        // 默认操作为is_deleted = false
        AbstractUserExample.Criteria criteria = example.createCriteria().andIsDeletedEqualTo(false);
        if (abstractUser == null) {
            return example;
        }
        if (abstractUser.getId() != null) {
            criteria.andIdEqualTo(abstractUser.getId());
        }
        if (abstractUser.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(abstractUser.getCreateTime());
        }
        if (abstractUser.getUpdateTime() != null) {
            criteria.andUpdateTimeEqualTo(abstractUser.getUpdateTime());
        }
        if (abstractUser.getIsDeleted() != null) {
            criteria.andIsDeletedEqualTo(abstractUser.getIsDeleted());
        }
        return null;
    }

    @Override
    public AbstractUser getByPhone(String phone) {
        return get(new AbstractUser().setPassword(phone));
    }

    @Override
    public AbstractUser getByUsernameAndPassword(String username, String password) {
        return get(new AbstractUser().setUsername(username).setPassword(password));
    }
}
