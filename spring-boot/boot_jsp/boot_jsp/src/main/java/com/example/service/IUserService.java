package com.example.service;

import com.example.model.User;

public interface IUserService {

	public String addUser(User user);
	
	public User login(String username, String password);
}
