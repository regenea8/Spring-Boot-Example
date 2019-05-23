package jpa.postgresql.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.postgresql.example.model.User;
import jpa.postgresql.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// insert
	public String save(User user) {
		userRepository.save(user);
		return "Saved";
	}
	
	// select *
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	// select count()
	public long count() {
		return userRepository.count();
	}
	
	// update
	public String update(User user) {
		userRepository.save(user);
		return "Update";
	}
	
	// delete
	public String delete(User user) {
		userRepository.delete(user);
		return "Deleted";
	}
	
}
