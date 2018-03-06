package com.legend.module.core.facade.sys.impl;

import com.legend.module.core.entity.sys.SysPermission;
import com.legend.module.core.entity.sys.SysRoleRelPermission;
import com.legend.module.core.entity.sys.SysUser;
import com.legend.module.core.entity.sys.SysUserRelRole;
import com.legend.module.core.service.sys.SysPermissionService;
import com.legend.module.core.service.sys.SysRoleRelPermissionService;
import com.legend.module.core.service.sys.SysUserRelRoleService;
import com.legend.module.core.service.sys.SysUserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 * @date 2018/3/3
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private SysUserService sysUserService;

    @Resource
    private SysPermissionService sysPermissionService;

    @Resource
    private SysUserRelRoleService sysUserRelRoleService;

    @Resource
    private SysRoleRelPermissionService sysRoleRelPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.getByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SysUserRelRole> sysUserRelRoles = sysUserRelRoleService.getListBySysUserId(sysUser.getId());
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (sysUserRelRoles != null && sysUserRelRoles.isEmpty()) {
            List<Integer> roleIds = sysUserRelRoles.stream().map(SysUserRelRole::getSysRoleId).collect(Collectors.toList());
            List<SysRoleRelPermission> sysRoleRelPermissions = sysRoleRelPermissionService.getListByRolesIds(roleIds);
            List<Integer> permissionIds = sysRoleRelPermissions.stream().map(SysRoleRelPermission::getSysPermissionId)
                    .collect(Collectors.toList());
            List<SysPermission> sysPermissions = sysPermissionService.getListByIds(permissionIds);
            sysPermissions.forEach(sysPermission -> grantedAuthorities.add(new SimpleGrantedAuthority(sysPermission
                    .getPermissionName())));
        }
        return new User(sysUser.getUsername(), sysUser.getPassword(), grantedAuthorities);

    }
}
