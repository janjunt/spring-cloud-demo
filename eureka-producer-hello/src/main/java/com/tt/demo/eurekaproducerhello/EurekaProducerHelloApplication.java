package com.tt.demo.eurekaproducerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProducerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerHelloApplication.class, args);
	}

}
