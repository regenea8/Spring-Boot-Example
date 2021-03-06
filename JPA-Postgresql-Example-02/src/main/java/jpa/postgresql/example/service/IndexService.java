package jpa.postgresql.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.postgresql.example.model.User;
import jpa.postgresql.example.repository.IndexRepository;

@Service
public class IndexService {
	
	@Autowired
	private IndexRepository indexRepository;

	// select *
	public Iterable<User> findAll() {
		return indexRepository.findAll();
	}
	
}
