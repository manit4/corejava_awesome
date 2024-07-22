package com.example.repository;

import java.util.List;

import com.example.model.User;

public interface IUserRepository {

	public String addUser(User user);
	
	public User findUser(String username, String password);
	
	public List<User> allUsers();
	
	public String delete(String userId);
	
	public User findUser(String username);
	
	public void updateUser(User user);
}
