package com.legend.base.web.controller.manager;


import com.legend.base.utils.HttpSessionUtils;
import com.legend.base.web.controller.BaseController;
import com.legend.base.vo.UserVO;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Component
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
