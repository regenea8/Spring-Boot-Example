package com.example.SpringbootRecipe02;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRecipe02Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringbootRecipe02Application.class, args);
		
		System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
		
		var names = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		Arrays.asList(names).forEach(System.out::println);
	}

}
