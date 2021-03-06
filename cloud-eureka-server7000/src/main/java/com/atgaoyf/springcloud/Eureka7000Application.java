package com.atgaoyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/6 16:10
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7000Application {

    public static void main(String[] args) {
        
        SpringApplication.run(Eureka7000Application.class, args);
    }
}
