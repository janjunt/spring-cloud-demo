package com.tt.demo.nacosproducerhello.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello " + name;
    }
}
