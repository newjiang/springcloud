package com.jiang.springcloud.api.service;

import com.jiang.springcloud.api.model.User;
import org.springframework.stereotype.Component;

/**
 * @Date: 2019/4/7 15:12
 * @Auther: newjiang
 * @Description:
 */
@Component
public class UserClientServiceFallbackFactory implements UserClientService {

    @Override
    public User get(Integer id) {
        return new User(id, "tan90°", -1);
    }

}
