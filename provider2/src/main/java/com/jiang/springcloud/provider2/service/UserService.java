package com.jiang.springcloud.provider2.service;

import com.jiang.springcloud.api.model.User;
import com.jiang.springcloud.api.service.UserClientService;
import com.jiang.springcloud.provider2.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/4/6 14:26
 * @Auther: newjiang
 * @Description:
 */
@Service
public class UserService  implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

}
