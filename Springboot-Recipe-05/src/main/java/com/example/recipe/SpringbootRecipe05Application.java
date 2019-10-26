package com.example.recipe;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.recipe.model.Book;
import com.example.recipe.service.BookService;

@SpringBootApplication
public class SpringbootRecipe05Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRecipe05Application.class, args);
	}

	@Bean
	public ApplicationRunner booksInitializer(BookService bookService) {
    	return args -> {
				bookService.create(new Book("9780061120084", "To Kill a Mockingbird", "Harper Lee"));
				bookService.create(new Book("9780451524935", "1984", "George Orwell"));
				bookService.create(new Book("9780618260300", "The Hobbit", "J.R.R. Tolkien"));
		};

	}
}
