package com.jiang.springcloud.api.service;

import com.jiang.springcloud.api.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Date: 2019/4/6 14:22
 * @Auther: newjiang
 * @Description:
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER", fallback = UserClientServiceFallbackFactory.class)
public interface UserClientService {

    /**
     * 根据id查找用户
     *
     * @param id
     * @return user
     */
    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    User get(@PathVariable("id") Integer id);
}
