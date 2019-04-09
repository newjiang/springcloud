package com.jiang.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date: 2019/4/7 00:08
 * @Auther: newjiang
 * @Description:
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getIRule() {
        // return new RandomRule();
        // 采用自定义的规则
        return new NewRule();
    }

}