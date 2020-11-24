package com.tt.demo.nacosconfig.web.controller;

import com.tt.demo.nacosconfig.config.HelloConfig;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
@RefreshScope
public class HomeController {
    @Resource
    private HelloConfig helloConfig;

    @GetMapping("/hello")
    public String hello(){
        return helloConfig.getHello();
    }
}
