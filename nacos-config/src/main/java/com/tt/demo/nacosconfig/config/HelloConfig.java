package com.tt.demo.nacosconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Data
public class HelloConfig {
    private String hello = "hello config";
}
