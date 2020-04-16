package com.cap.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DeleteEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteEmployeeApplication.class, args);
	}

}
