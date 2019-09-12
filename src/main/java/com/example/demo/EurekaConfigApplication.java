package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigApplication.class, args);
	}
	public static void main2(String[] args) {
		SpringApplication.run(EurekaConfigApplication.class, args);
		System.out.println("111111111111");
	}


	public static void say(){
		System.out.println("nihao");
	}
}
