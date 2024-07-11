package com.spring.service;

import com.spring.dao.UserDAO;
import com.spring.pojo.User;

public class UserService {
	
	UserDAO userDAO = new UserDAO();
	
	public void saveUser(User user) {
		
		userDAO.addUser(user);
	}
	
	public User searchUser(String userId) {
		
		return userDAO.find(userId);
	}

}
