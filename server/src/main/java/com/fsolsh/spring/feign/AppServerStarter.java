package com.fsolsh.spring.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Service Provider Starter
 * @EnableDiscoveryClient register the service with registration Center
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppServerStarter {
    public static void main(String[] args) {
        SpringApplication.run(AppServerStarter.class, args);
        System.out.println("AppServerStarter is running");
    }
}
