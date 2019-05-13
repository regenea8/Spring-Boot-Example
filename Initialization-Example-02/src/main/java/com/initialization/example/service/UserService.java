package com.initialization.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.initialization.example.domain.User;
import com.initialization.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String save(User user) {
		userRepository.save(user);
		return "Saved";
	}
	
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
}
