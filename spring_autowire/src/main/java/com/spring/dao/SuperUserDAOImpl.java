package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.pojo.User;
import com.spring.service.IUserService;

@Repository
public class SuperUserDAOImpl implements IUserDAO {
	
@Autowired
@Qualifier(value = "t1")
Thread thread;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User find(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
