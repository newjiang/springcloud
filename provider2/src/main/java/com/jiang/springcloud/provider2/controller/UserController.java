package com.jiang.springcloud.provider2.controller;

import com.jiang.springcloud.api.model.User;
import com.jiang.springcloud.provider2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date: 2019/4/6 14:25
 * @Auther: newjiang
 * @Description:
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/get/{id}")
    public User get(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        if (user == null) {
            throw new RuntimeException("出错咯 ! ! !");
        }
        return user;
    }
}
