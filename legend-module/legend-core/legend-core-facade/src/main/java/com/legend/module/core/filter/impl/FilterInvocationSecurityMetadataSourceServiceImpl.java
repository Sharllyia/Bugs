package com.legend.module.core.filter.impl;

import com.legend.module.core.entity.sys.SysPermission;
import com.legend.module.core.filter.FilterInvocationSecurityMetadataSourceService;
import com.legend.module.core.service.sys.SysPermissionService;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/3/4
 */
@Service
public class FilterInvocationSecurityMetadataSourceServiceImpl implements FilterInvocationSecurityMetadataSourceService {

    @Resource
    private SysPermissionService sysPermissionService;

    private HashMap<String, Collection<ConfigAttribute>> map = null;

    /**
     * 加载权限表中所有权限
     */
    private void loadResourceDefine() {
        map = new HashMap<>();
        Collection<ConfigAttribute> array;
        ConfigAttribute cfg;
        List<SysPermission> permissions = sysPermissionService.getList();
        for (SysPermission permission : permissions) {
            array = new ArrayList<>();
            //此处只添加了用户的名字，其实还可以添加更多权限的信息，例如请求方法到ConfigAttribute的集合中去。
            // 此处添加的信息将会作为AccessDecisionManager类的decide的第三个参数。
            array.add(new SecurityConfig(permission.getPermissionName()));
            array.add(new SecurityConfig(permission.getSign()));
            //用权限的getUrl() 作为map的key，用ConfigAttribute的集合作为 value，
            map.put(permission.getUrl(), array);
        }

    }


    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        if (map == null) {
            loadResourceDefine();
        }
        //object 中包含用户请求的request 信息
        HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
        AntPathRequestMatcher matcher;
        for (String url : map.keySet()) {
            matcher = new AntPathRequestMatcher(url);
            if (matcher.matches(request)) {
                return map.get(url);
            }
        }
        return null;

    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
