package com.legend.module.core;

import com.legend.module.core.entity.sys.SysUser;
import com.legend.module.core.service.sys.SysUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LegendCoreServiceApplication.class)
@Rollback
public class LegendCoreServiceApplicationTests {

    @Resource
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        SysUser sysUser = sysUserService.getById(1);
        Assert.assertNotNull(sysUser);
    }

}
