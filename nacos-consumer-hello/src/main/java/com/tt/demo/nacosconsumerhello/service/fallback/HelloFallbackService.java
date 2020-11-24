package com.tt.demo.nacosconsumerhello.service.fallback;

import com.tt.demo.nacosconsumerhello.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloFallbackService implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name + ", this messge send failed";
    }
}
