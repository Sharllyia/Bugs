package com.legend.module.core.web.controller.website;

import com.legend.module.core.web.vo.core.UserVO;
import org.springframework.stereotype.Controller;
import com.legend.module.core.web.controller.AbstractController;


/**
 * @author Administrator
 * @date 2018/1/8
 */
@Controller
public class AbstractWebsiteController extends AbstractController {


    @Override
    protected void setCurrentUser(UserVO user) {

    }

    @Override
    protected Object getCurrentUser() {
        return null;
    }
}
