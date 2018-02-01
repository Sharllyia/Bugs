package com.legend.base.web.controller.website;

import com.legend.base.vo.UserVO;
import com.legend.base.web.controller.BaseController;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Controller
public class WebsiteBaseController extends BaseController {


    @Override
    protected void setCurrentUser(UserVO user) {

    }

    @Override
    protected Object getCurrentUser() {
        return null;
    }
}
