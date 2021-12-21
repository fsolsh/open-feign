package com.fsolsh.spring.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignDemoController {

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam String data) throws InterruptedException {
        Thread.sleep(1000);
        return "hi " + data;
    }

}
