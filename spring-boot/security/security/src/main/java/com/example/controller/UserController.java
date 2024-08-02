package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
@RequestMapping("/user/")
public class UserController {
	
	@GetMapping("message")
	@PreAuthorize("hasRole('Admin')")
	public String getMessage() {
			
			return "This is my First Message";
	}
	
	@GetMapping("getUser/{userId}")
	public User getUser( @PathVariable String userId) {
		
		System.out.println("This is userId from UserController "+userId);
		
		User user = new User("laurene@123", "123", "Laurene Dai");
		
		return user;
	}

}
