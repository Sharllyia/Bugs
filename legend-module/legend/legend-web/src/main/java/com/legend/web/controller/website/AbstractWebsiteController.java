package com.legend.web.controller.website;

import com.legend.model.contant.arribute.Key;
import com.legend.utils.HttpSessionUtils;
import com.legend.vo.user.AbstractUserVO;
import com.legend.web.controller.AbstractController;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Controller
public class AbstractWebsiteController extends AbstractController {


    @Override
    protected void setCurrentUser(AbstractUserVO user) {
        HttpSessionUtils.setAttribute(Key.CURRENT_USER, user);
    }

    @Override
    protected Object getCurrentUser() {
        return HttpSessionUtils.getAttribute(Key.CURRENT_USER);
    }
}
