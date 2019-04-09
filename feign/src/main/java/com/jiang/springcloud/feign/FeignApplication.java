package com.jiang.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Date: 2019/4/7 00:27
 * @Auther: newjiang
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.jiang.springcloud"})
@ComponentScan("com.jiang.springcloud")
@EnableDiscoveryClient
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
