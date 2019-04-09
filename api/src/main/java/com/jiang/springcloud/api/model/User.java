package com.jiang.springcloud.api.model;

import java.io.Serializable;

/**
 * @Date: 2019/4/6 14:21
 * @Auther: newjiang
 * @Description:
 */
public class User implements Serializable {

    // 用户ID
    private Integer id;
    // 用户名字
    private String username;
    // 用户年龄
    private Integer age;

    public User() {
    }

    public User(Integer id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

