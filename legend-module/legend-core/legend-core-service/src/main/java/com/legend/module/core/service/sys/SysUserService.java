package com.legend.module.core.service.sys;

import com.legend.module.core.entity.sys.SysUser;
import com.legend.module.core.service.core.LegendService;

/**
 * @author Administrator
 * @date 2018/3/1
 */
public interface SysUserService extends LegendService<SysUser> {

    /**
     * 根据用户名得到用户
     *
     * @param name 用户名
     * @return sysUser
     */
    SysUser getByUsername(String name);
}
