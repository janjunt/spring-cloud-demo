package com.tt.demo.springcloudconsumerhello.service.hystrix;

import com.tt.demo.springcloudconsumerhello.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name + ", this messge send failed";
    }
}
