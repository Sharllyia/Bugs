package com.legend.base.web.controller.website;

import com.legend.base.vo.BaseUserVO;
import com.legend.base.web.controller.BaseController;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Controller
public class WebsiteBaseController extends BaseController {


    @Override
    protected void setCurrentUser(BaseUserVO user) {

    }

    @Override
    protected Object getCurrentUser() {
        return null;
    }
}
