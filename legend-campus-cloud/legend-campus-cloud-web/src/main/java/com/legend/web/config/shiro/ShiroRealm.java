package com.legend.web.config.shiro;

import com.legend.base.entity.base.BaseUser;
import com.legend.base.service.BaseUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2017/2/4
 */
public class ShiroRealm extends AuthenticatingRealm {

    @Resource
    private BaseUserService baseUserService;

    /**
     * 1.doGetAuthenticationInfo，获取认证消息，如果数据库中没有数，返回null，如果得到了正确的用户名和密码，
     * 返回指定类型的对象
     * <p>
     * 2.AuthenticationInfo 可以使用SimpleAuthenticationInfo实现类，封装正确的用户名和密码。
     * <p>
     * 3.token参数 就是我们需要认证的token
     *
     * @param authenticationToken 验证的用户名和密码
     * @return info 认证信息
     * @throws AuthenticationException 认证异常
     */

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 将token装换成UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        // 获取用户名即可
        String username = upToken.getUsername();
        // 查询数据库，是否查询到用户名和密码的用户
        BaseUser baseUser = baseUserService.getByUserName(username);
        SimpleAuthenticationInfo info;
        if (baseUser != null) {
            // 如果查询到了，封装查询结果，返回给我们的调用
            Object principal = baseUser.getUsername();
            Object credentials = baseUser.getPassword();
            // 获取盐值，即用户名
            ByteSource salt = ByteSource.Util.bytes(username);
            String realmName = this.getName();
            // 将账户名，密码，盐值，realmName实例化到SimpleAuthenticationInfo中交给Shiro来管理
            info = new SimpleAuthenticationInfo(principal, credentials, salt, realmName);
        } else {
            // 如果没有查询到，抛出一个异常
            throw new AuthenticationException();
        }
        return info;
    }
}