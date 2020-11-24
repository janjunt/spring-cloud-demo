package com.tt.demo.nacosproducerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProducerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProducerHelloApplication.class, args);
	}

}
