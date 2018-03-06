package com.legend.web.controller.manager.admin;

import com.legend.model.json.result.Ajax;
import com.legend.web.controller.manager.AbstractManagerController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Component
@RequestMapping("/admin")
public class AdminUserController extends AbstractManagerController {


    @RequestMapping("/login")
    @ResponseBody
    public Ajax login(String username, String password) {


        return Ajax.success();
    }
}
