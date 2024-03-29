package com.legend.module.core.web.controller;


import com.legend.module.core.web.vo.core.UserVO;

/**
 * @author Administrator
 * @date 2018/1/8
 */
public abstract class AbstractController {
    /**
     * 设置当前用户，存入session中
     *
     * @param user 当前用户
     */
    protected abstract void setCurrentUser(UserVO user);

    /**
     * 得到当前用户，从session中取值
     *
     * @return 当前用户
     */
    protected abstract Object getCurrentUser();

}
