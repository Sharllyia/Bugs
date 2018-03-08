package com.legend.module.core;

import com.legend.module.core.entity.sys.SysPermission;
import com.legend.module.core.entity.sys.SysUser;
import com.legend.module.core.dao.mapper.sys.SysPermissionMapper;
import com.legend.module.core.dao.mapper.sys.SysUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LegendCoreDaoApplication.class)
@Rollback
public class LegendCoreDaoApplicationTests {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Test
    public void testSysUserMapper() {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(1);
        System.out.println(sysUser.toString());
        Assert.assertNotNull(sysUser);
    }

    @Test
    public void testSysPermissionMapper() throws Exception {
        SysPermission sysPermission = sysPermissionMapper.selectByPrimaryKey(1);
        System.out.println(sysPermission.toString());
        Assert.assertNotNull(sysPermission);
    }
}
