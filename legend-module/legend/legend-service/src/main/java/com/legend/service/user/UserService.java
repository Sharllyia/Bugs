package com.legend.service.user;

import com.legend.entity.user.AbstractUser;
import com.legend.service.Service;

/**
 * @author Administrator
 * @date 2018/2/17
 */
public interface UserService extends Service<AbstractUser> {
    /**
     * 根据手机号查询
     *
     * @param phone 手机号
     * @return AbstractUser
     */
    AbstractUser getByPhone(String phone);

    /**
     * 根据用户名和密码查询
     *
     * @param username 用户名
     * @param password 密码
     * @return AbstractUser
     */
    AbstractUser getByUsernameAndPassword(String username, String password);
}
