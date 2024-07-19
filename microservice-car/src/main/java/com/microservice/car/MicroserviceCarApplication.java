package com.microservice.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCarApplication.class, args);
	}

}
