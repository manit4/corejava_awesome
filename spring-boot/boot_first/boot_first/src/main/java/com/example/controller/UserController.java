package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Login;
import com.example.model.User;

@RestController
@RequestMapping("/user/")//THis RequestMapping is applied on the class level...
public class UserController {
	
	public UserController() {
		System.out.println("UserController no-arg constr..");
	}
	
	@GetMapping("msg")//This mapping is applied on the method level...
	public String firstMessage() {//This api will return data in plane text as a response
		
		return "I am home page from firstMessage()";
	}
	
	@GetMapping("second")
	public String secondMsg() {
		
		return "I am second Message and I am updating after dev-tools it ofr the third time";
	}
	
	@GetMapping("getUser")
	public User getUser() {//This api will return data in JSON format as a response
		
		User user = new User("eileen01", "1234", "Eileen");
		
		return user;
	}

	@GetMapping("allUsers")
	public List<User> getUsers() {//This api will return data in JSON format as a response
		
		List<User> users = new ArrayList<>();
		
		User user1 = new User("eileen01", "1234", "Eileen");
		User user2 = new User("xi01", "2345", "Xi");
		User user3 = new User("zhen01", "3456", "Zhen");
		
		users.add(user1);  users.add(user2);   users.add(user3);
		
		return users;
	}
	
	@GetMapping("userById/{userId}")
	public User findUserById(@PathVariable String userId) {
		
		System.out.println("inside findUserById..."+userId);
		
		User user = new User("eileen01", "1234", "Eileen");
		
		return user;
	}
	
	@PostMapping("login")
	public String login( @RequestBody Login login) {
		
		System.out.println(login.getUsername()+", "+login.getPassword());
		
		return "Login Successfull";
	}
	
	@DeleteMapping("delete/{userId}")
	public String deleteUser( @PathVariable String userId) {
		
		System.out.println("The userId from teh request is "+userId);
		
		return "User Deleted";
		
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllUsers() {
		
		System.out.println("All users Deleted...");
		
		return "All users Deleted Successfully";
	}
	
	@PutMapping("update/{userId}/{emailAddress}")
	public String updateUser(@PathVariable String userId, @PathVariable String emailAddress) {
		
		System.out.println(userId+", "+emailAddress);
		
		return "User updated Successfully";
	}
}
