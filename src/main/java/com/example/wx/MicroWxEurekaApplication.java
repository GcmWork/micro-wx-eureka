package com.example.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
@EnableEurekaClient
public class MicroWxEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWxEurekaApplication.class, args);
	}
}
