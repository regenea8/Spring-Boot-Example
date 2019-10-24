package com.example.recipe;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	@PostConstruct	// 이 붙은 함수는 객체 생성 및 모든 의존성이 주입된 뒤 실행된다.
	public void sayHello() {
		System.out.println("Hello World, from Spring Boot 2!");
	}
}
