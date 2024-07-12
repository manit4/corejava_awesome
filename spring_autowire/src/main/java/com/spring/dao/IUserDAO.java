package com.spring.dao;

import java.util.List;

import com.spring.pojo.User;

public interface IUserDAO {

	public void addUser(User user);

	public User find(String userId);
	
	public List<User> allUsers();

}
