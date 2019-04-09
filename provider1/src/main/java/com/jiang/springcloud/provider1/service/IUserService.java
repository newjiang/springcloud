package com.jiang.springcloud.provider1.service;

import com.jiang.springcloud.api.model.User;

/**
 * @Date: 2019/4/7 02:53
 * @Auther: newjiang
 * @Description:
 */
public interface IUserService {
    /**
     * 根据id查找用户
     *
     * @param id
     * @return user
     */
    User findById(Integer id);
}
