package com.example.repository;

import com.example.model.User;

public interface IUserRepository {
	
	public void addUser(User user);
	
	public User findUser(String userId, String password);

}
