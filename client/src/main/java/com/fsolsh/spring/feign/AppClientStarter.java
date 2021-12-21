package com.fsolsh.spring.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Service Consumer Starter
 *
 * @EnableFeignClients support feign
 * @EnableDiscoveryClient fetch the service from registration Center
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AppClientStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppClientStarter.class, args);
        System.out.println("AppClientStarter is running");
    }

}