package com.tt.demo.springcloudconfigclient.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class HomeController {
    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello(){
        return hello;
    }
}
