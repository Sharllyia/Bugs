package com.legend.module.core.web.controller.manager;


import com.legend.module.core.web.vo.core.UserVO;
import com.legend.module.core.web.controller.AbstractController;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Component
public class AbstractManagerController extends AbstractController {

    @Override
    protected void setCurrentUser(UserVO currentUser) {
    }

    @Override
    protected UserVO getCurrentUser() {
        return null;
    }

}
