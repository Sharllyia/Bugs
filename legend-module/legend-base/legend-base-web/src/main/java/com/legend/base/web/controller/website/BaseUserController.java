package com.legend.base.web.controller.website;

import com.legend.base.entity.base.BaseUser;
import com.legend.base.service.BaseUserService;
import com.legend.base.vo.base.BaseUserVO;
import com.legend.model.json.result.Ajax;
import com.legend.web.controller.website.user.AbstractUserController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2018/2/27
 */
@Controller
@RequestMapping("/user")
public class BaseUserController extends AbstractUserController<BaseUser, BaseUserVO> {

    @Resource
    private BaseUserService baseUserService;


    @Override
    protected void loginProcess() {

    }

    @Override
    protected void logoutProcess() {

    }

    @Override
    protected void registerProcess() {

    }

    @Override
    protected void updatePasswordProess() {

    }

    @RequestMapping("/info")
    @ResponseBody
    public Ajax getUser(String name) {
        return Ajax.success(baseUserService.getByUserName(name));

    }

}
