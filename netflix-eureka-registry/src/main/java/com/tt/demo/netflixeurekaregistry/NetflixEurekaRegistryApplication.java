package com.tt.demo.netflixeurekaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaRegistryApplication.class, args);
	}

}
