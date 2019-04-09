package com.jiang.springcloud.feign.controller;

import com.jiang.springcloud.api.model.User;
import com.jiang.springcloud.api.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @Date: 2019/3/24 14:53
 * @Auther: newjiang
 * @Description:
 */
@Controller
public class FeignController {

    @Autowired
    private UserClientService userClientService;

    @ResponseBody
    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Integer id) {
        User user = userClientService.get(id);
        return user;
    }

}
