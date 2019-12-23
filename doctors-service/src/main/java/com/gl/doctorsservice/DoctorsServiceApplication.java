package com.gl.doctorsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DoctorsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorsServiceApplication.class, args);
	}

}
