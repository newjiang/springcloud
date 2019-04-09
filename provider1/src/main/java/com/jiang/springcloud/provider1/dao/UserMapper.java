package com.jiang.springcloud.provider1.dao;

import com.jiang.springcloud.api.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Date: 2019/4/6 14:26
 * @Auther: newjiang
 * @Description:
 */
@Mapper
public interface UserMapper {

    /**
     * 根据id查找用户
     * @param id
     * @return user
     */
    User findById(Integer id);

}