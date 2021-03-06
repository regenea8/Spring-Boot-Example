package com.example.recipe.service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.example.recipe.model.Book;

@Service
class InMemoryBookService implements BookService {

	private final Map<String, Book> books = new ConcurrentHashMap<>();

	@Override
	public Iterable<Book> findAll() {
		return books.values();
	}

	@Override
	public Book create(Book book) {
		books.put(book.getIsbn(), book);
		return book;
	}

	@Override
	public Optional<Book> find(String isbn) {
		return Optional.ofNullable(books.get(isbn));
	}
}
