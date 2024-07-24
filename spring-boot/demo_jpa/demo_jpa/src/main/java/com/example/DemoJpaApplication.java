package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.User;
import com.example.service.UserService;

@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {
	
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		
		//userService.addUser();
		
		//here I am deleting the record...
		
		//userService.deleteUser();
		
		List<User> users = userService.findAll();
		
		users.forEach(user -> System.out.println(user.getUsername()+", "+user.getName()));
	}

}
