package com.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AlgoDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgoDoApplication.class, args);
	}

}





















// http://localhost:8088/swagger-ui.html#/