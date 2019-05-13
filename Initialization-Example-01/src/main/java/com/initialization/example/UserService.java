package com.initialization.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
