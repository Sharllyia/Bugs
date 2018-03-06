package com.legend.base.service;

import com.legend.base.entity.base.BaseUser;
import com.legend.service.Service;

/**
 * @author Administrator
 * @date 2018/2/14
 */
public interface BaseUserService extends Service<BaseUser> {

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return baseUser
     */
    BaseUser getByUserName(String username);

}
