package com.jiang.springcloud.consumer.controller;

import com.jiang.springcloud.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


/**
 * @Date: 2019/3/24 14:53
 * @Auther: newjiang
 * @Description:
 */
@Controller
@RequestMapping("user")
public class ConsumerController {

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/get/{id}")
    public ResponseEntity<User> get(@PathVariable("id") Integer id) {
        return restTemplate.getForEntity(REST_URL_PREFIX + "/user/findById/" + id, User.class);
    }

}
