package com.tt.demo.springcloudconsumerhello.service;

import com.tt.demo.springcloudconsumerhello.service.fallback.HelloFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "spring-cloud-producer-hello", fallback = HelloFallbackService.class)
public interface HelloService {
    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
