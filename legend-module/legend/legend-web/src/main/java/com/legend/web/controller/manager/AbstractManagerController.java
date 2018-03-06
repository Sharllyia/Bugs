package com.legend.web.controller.manager;


import com.legend.entity.user.AbstractUser;
import com.legend.model.contant.arribute.Key;
import com.legend.utils.HttpSessionUtils;
import com.legend.vo.user.AbstractUserVO;
import com.legend.web.controller.AbstractController;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2018/1/8
 */
@Component
public class AbstractManagerController extends AbstractController {

    @Override
    protected void setCurrentUser(AbstractUserVO currentUser) {
        HttpSessionUtils.setAttribute(Key.CURRENT_USER, currentUser);
    }

    @Override
    protected AbstractUserVO getCurrentUser() {
        return (AbstractUserVO) HttpSessionUtils.getAttribute(Key.CURRENT_USER);
    }

}
