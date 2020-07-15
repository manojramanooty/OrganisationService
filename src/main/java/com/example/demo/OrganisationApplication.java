package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages="com.organisation.controller")
public class OrganisationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganisationApplication.class, args);
	}

}
