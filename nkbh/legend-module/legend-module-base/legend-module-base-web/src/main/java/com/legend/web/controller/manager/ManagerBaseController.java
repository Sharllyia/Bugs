package com.legend.web.controller.manager;

import com.legend.utils.HttpSessionUtils;
import com.legend.web.controller.BaseController;
import com.legend.web.model.vo.UserVO;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Controller
public class ManagerBaseController extends BaseController {

    @Override
    protected void setCurrentUser(UserVO currentUser) {
        HttpSessionUtils.setSession("currentUser",currentUser);
    }

    @Override
    protected UserVO getCurrentUser() {
        return (UserVO) HttpSessionUtils.getSession("currentUser");
    }

}
