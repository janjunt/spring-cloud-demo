package com.tt.demo.nacosconsumerhello.web.controller;

import com.tt.demo.nacosconsumerhello.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class HomeController {
    @Resource
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return helloService.hello(name);
    }
}
