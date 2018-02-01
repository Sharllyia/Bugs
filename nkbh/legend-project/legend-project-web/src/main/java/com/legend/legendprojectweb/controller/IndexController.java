package com.legend.legendprojectweb.controller;

import com.legend.dao.model.json.AjaxResult;
import com.legend.dao.model.json.result.AjaxSuccess;
import com.legend.legendprojectweb.model.vo.User;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2018/1/6
 */
@Component
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("message", "Hollo World!");
        return "index";
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public AjaxResult get(Integer id) {
        Map<Integer, User> userMap = new HashMap<Integer, User>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("hp");
        user1.setAge(22);
        user1.setSex("男");
        User user2 = new User();
        user2.setId(2);
        user2.setName("sb");
        user2.setAge(11);
        user2.setSex("女");
        userMap.put(1, user1);
        userMap.put(2, user2);
        return new AjaxSuccess(userMap.get(id), "哈哈哈");
    }
}
