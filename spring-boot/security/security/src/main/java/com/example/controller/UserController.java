package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/user/")
@CrossOrigin
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder encoder;

	@GetMapping("message")
	//@PreAuthorize("hasRole('Role_Admin')")
	public String getMessage() {

		return "This is my First Message";
	}

	@GetMapping("getUser/{userId}")
	public User getUser(@PathVariable String userId) {

		System.out.println("This is userId from UserController " + userId);

		User user = new User("laurene@123", "123", "Laurene Dai", "Admin", "true");

		return user;
	}

	@PostMapping("/registerr")
	public String registerUserr(@RequestBody User user) {

		System.out.println(user.getName() + ", " + user.getPassword()+", "+user.getIsEnabled());

		String encodedPassword = encoder.encode(user.getPassword());

		user.setPassword(encodedPassword);

		userRepository.save(user);

		return "User Registered Successfully";
	}

}
