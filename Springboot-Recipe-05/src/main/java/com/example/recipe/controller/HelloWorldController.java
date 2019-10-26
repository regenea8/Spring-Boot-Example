package com.example.recipe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@GetMapping("/")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello World, from Spring Boot 2!";
	}
}
