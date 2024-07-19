package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepository userRepository;

	@Override
	public String addUser(User user) {
		
		return userRepository.addUser(user);
	}

	@Override
	public User login(String username, String password) {
		
		return userRepository.findUser(username, password);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.allUsers();
	}

}
