package com.tt.demo.netflixeurekaproducerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetflixEurekaProducerHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaProducerHelloApplication.class, args);
	}

}
