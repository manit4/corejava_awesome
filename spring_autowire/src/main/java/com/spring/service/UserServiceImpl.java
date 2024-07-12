package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.dao.IUserDAO;
import com.spring.pojo.User;
import com.spring.util.ConnectionUtil;

@Service
@Scope(value = "prototype")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	@Qualifier(value = "userDAOImpl")
	IUserDAO userDAO;
	
	@Autowired
	ConnectionUtil connectionUtil;
	
	@Autowired
	@Qualifier(value = "t2")
	Thread thread;
	
	@Autowired
	@Qualifier(value = "t1")
	Thread thread2;
	
	public void saveUser(User user) {
		
		System.out.println("The value is "+connectionUtil.value+" the thread is "+thread.getName());
		userDAO.addUser(user);
	}
	
	public User searchUser(String userId) {
		System.out.println("The value is "+connectionUtil.value+" the thread is "+thread2.getName());
		return userDAO.find(userId);
	}

}
