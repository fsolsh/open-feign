package com.fsolsh.spring.feign.api;

import com.fsolsh.spring.feign.service.FeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FeignClient - FeignAPI
 *
 * @FeignClient set the name of the registry service - that is the provider; set the fallback handler
 */
@FeignClient(name = "feign-server", fallbackFactory = FeignFallbackFactory.class)
public interface IFeignClient {

    @GetMapping("/sayHi")
    String sayHi(@RequestParam String data);

}