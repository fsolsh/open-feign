package com.fsolsh.spring.feign.service;

import com.fsolsh.spring.feign.api.IFeignClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Fallback handler
 */
@Component
public class FeignFallbackFactory implements FallbackFactory<IFeignClient> {
    @Override
    public IFeignClient create(Throwable cause) {
        return i -> "fallback; reason was: " + cause.getMessage();
    }
}
