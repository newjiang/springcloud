package com.jiang.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Date: 2019/3/24 14:21
 * @Auther: newjiang
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
public class HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }

}
