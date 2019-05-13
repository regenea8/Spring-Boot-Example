package com.initialization.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.initialization.example")
@EnableJpaRepositories("com.initialization.example")
@EntityScan(basePackages = "com.initialization.example")
public class InitializationExample03Application {

	public static void main(String[] args) {
		SpringApplication.run(InitializationExample03Application.class, args);
	}

}
