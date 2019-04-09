package com.jinag.springcloud.eureka3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Date: 2019/4/6 15:06
 * @Auther: newjiang
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka3Application.class, args);
    }
}
