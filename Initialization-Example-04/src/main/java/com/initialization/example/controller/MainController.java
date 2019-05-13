package com.initialization.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.initialization.example.domain.User;
import com.initialization.example.service.UserService;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	//private UserRepository userRepository;
	private UserService userService;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		return userService.save(n);
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.findAll();
	}
	
	@GetMapping(path="/count")
	public @ResponseBody long getAllCount() {
		return userService.count();
	}
	
	@GetMapping(path="/delete")
	public @ResponseBody String delete(@RequestParam int id) {
		User n = new User();
		n.setId(id);
		return userService.delete(n);
	}
	
	@GetMapping(path="/update")
	public @ResponseBody String update(@RequestParam int id, @RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setId(id);
		n.setName(name);
		n.setEmail(email);
		return userService.save(n);
	}
	
}