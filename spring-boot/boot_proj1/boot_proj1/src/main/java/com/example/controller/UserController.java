package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Login;
import com.example.model.User;
import com.example.repository.IUserRepository;

@RestController
public class UserController {
	
	@Autowired
	IUserRepository userRepository;
	
	public UserController() {
		System.out.println("no-rg UserController constr...");
	}
	
	@PostMapping("/signup")
	public String register( @RequestBody User signup) {
		
		System.out.println(signup.getUsername()+", "+signup.getPassword());
		
		userRepository.addUser(signup);
		
		return "Signup Successfull";
	}
	
	@PostMapping("/login")
	public String loginUser( @RequestBody Login login) {
		
		String status = "Login Failed";
		
		System.out.println(login.getUsername()+", "+login.getPassword());
		
		User user = userRepository.findUser(login.getUsername(), login.getPassword());
		
		if( user != null) {
			
			status = "Login Successfull";
		}
		return status;
	}
	

}
