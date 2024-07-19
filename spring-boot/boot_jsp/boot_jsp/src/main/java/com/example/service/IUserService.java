package com.example.service;

import java.util.List;

import com.example.model.User;

public interface IUserService {

	public String addUser(User user);
	
	public User login(String username, String password);
	
	public List<User> getAllUsers();
}
