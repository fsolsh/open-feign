package com.fsolsh.spring.feign.controller;


import com.fsolsh.spring.feign.api.IFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController - to use Feign
 */
@RestController
public class FeignDemoController {

    //feign client declaration autowired, call remote as if calling local
    @Autowired
    private IFeignClient feignClient;

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam String name) {
        return feignClient.sayHi(name);
    }

}
