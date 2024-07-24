package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class BootJpaApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		User user = new User("eileen@1234", "1234", "eileen2@gmail.com");
//		
//		userRepository.save(user);
		
		List<User> users = userRepository.findAll();
		
		users.forEach(user -> System.out.println(user.getUsername()+", "+user.getName()));
	}

}
