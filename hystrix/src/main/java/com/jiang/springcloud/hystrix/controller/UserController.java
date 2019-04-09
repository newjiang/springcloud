package com.jiang.springcloud.hystrix.controller;

import com.jiang.springcloud.api.model.User;
import com.jiang.springcloud.hystrix.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "hystrixErr")
    public User get(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        if (user == null) {
            throw new RuntimeException("id:" + id + "的用户不存在！！！");
        }
        return user;
    }

    public User hystrixErr(@PathVariable("id") Integer id) {
        return new User(id, "tan90°, hystrixErr", -1);
    }

}
