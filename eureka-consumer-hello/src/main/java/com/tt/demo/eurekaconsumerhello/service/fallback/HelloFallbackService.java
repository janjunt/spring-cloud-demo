package com.tt.demo.eurekaconsumerhello.service.fallback;

import com.tt.demo.eurekaconsumerhello.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloFallbackService implements HelloService {
    @Override
    public String hello(String name) {
        return "Eureka Hello " + name + ", this messge send failed";
    }
}
