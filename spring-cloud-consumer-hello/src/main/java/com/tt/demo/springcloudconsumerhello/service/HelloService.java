package com.tt.demo.springcloudconsumerhello.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("spring-cloud-producer-hello")
public interface HelloService {
    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
