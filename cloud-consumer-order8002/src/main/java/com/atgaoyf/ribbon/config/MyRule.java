package com.atgaoyf.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/11 20:01
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRule() {

        return new RandomRule();
    }
}
