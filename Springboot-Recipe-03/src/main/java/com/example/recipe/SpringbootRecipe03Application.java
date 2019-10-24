package com.example.recipe;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.recipe.calculator.Calculator;

@SpringBootApplication
public class SpringbootRecipe03Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringbootRecipe03Application.class, args);
	}
	
	@Bean
	public ApplicationRunner calculationRunner(Calculator calculator) {
		return args -> {
			calculator.calculate(137, 21, '+');
			calculator.calculate(137, 21, '*');
			calculator.calculate(137, 21, '-');
		};
	}

}
