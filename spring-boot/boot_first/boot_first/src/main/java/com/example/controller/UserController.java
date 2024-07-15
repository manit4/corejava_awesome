package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class UserController {
	
	public UserController() {
		System.out.println("UserController no-arg constr..");
	}
	
	@GetMapping("/msg")
	public String firstMessage() {
		
		return "I am home page from firstMessage()";
	}
	
	@GetMapping("/second")
	public String secondMsg() {
		
		return "I am second Message and I am updating after dev-tools it ofr the third time";
	}
	
	@GetMapping("/getUser")
	public User getUser() {
		
		User user = new User("eileen01", "1234", "Eileen");
		
		return user;
	}

	@GetMapping("/allUsers")
	public List<User> getUsers() {
		
		List<User> users = new ArrayList<>();
		
		User user1 = new User("eileen01", "1234", "Eileen");
		User user2 = new User("xi01", "2345", "Xi");
		User user3 = new User("zhen01", "3456", "Zhen");
		
		users.add(user1);  users.add(user2);   users.add(user3);
		
		return users;
	}
}
