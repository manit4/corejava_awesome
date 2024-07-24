package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void addUser() throws Exception {
		
		userRepository.addUser();
	}
	
	public void deleteUser() throws Exception {
		
		userRepository.delete();
	}
	
	public List<User> findAll() throws Exception {
		
		return userRepository.findAllUsers();
	}

}
