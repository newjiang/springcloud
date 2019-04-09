package com.jiang.springcloud.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Date: 2019/3/24 14:21
 * @Auther: newjiang
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider1Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class, args);
    }

}
