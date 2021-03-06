package com.tt.demo.nacosconsumerhello.service;

import com.tt.demo.nacosconsumerhello.service.fallback.HelloFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nacos-producer-hello", fallback = HelloFallbackService.class)
public interface HelloService {
    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
