package com.example.recipe;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRecipe01Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringbootRecipe01Application.class, args);
		
		System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
		
		var names = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		Arrays.asList(names).forEach(System.out::println);
	}
}
