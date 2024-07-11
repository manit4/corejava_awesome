package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDAO;
import com.spring.pojo.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;
	
	public void saveUser(User user) {
		
		userDAO.addUser(user);
	}
	
	public User searchUser(String userId) {
		
		return userDAO.find(userId);
	}

}
