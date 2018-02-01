package com.legend.base.web.controller.manager.admin;

import com.legend.base.web.controller.manager.ManagerBaseController;
import com.legend.base.model.json.AjaxResult;
import com.legend.base.model.json.result.AjaxSuccess;
import com.legend.base.vo.UserVO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Component
@RequestMapping("/admin")
public class AdminUserController extends ManagerBaseController {


    @RequestMapping("/login")
    @ResponseBody
    public AjaxResult login(UserVO userVO) {


        return new AjaxSuccess();
    }
}
