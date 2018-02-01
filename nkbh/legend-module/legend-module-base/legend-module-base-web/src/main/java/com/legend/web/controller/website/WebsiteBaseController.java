package com.legend.web.controller.website;

import com.legend.web.controller.BaseController;
import com.legend.web.model.vo.UserVO;
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
