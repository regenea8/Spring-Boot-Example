package com.example.recipe.service;

import java.util.Optional;

import com.example.recipe.model.Book;

public interface BookService {

	Iterable<Book> findAll();
	Book create(Book book);
	Optional<Book> find(String isbn);
}
