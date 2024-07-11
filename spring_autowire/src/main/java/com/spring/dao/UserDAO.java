package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import com.spring.pojo.User;

public class UserDAO {
	
	List<User> users = new ArrayList<User>();
	
	public void addUser(User user) {
		
		users.add(user);
		System.out.println("The size is "+users.size());
	}
	
	public User find(String userId) {
		
		User user = null;
		
		for( User value : users) {
			if( userId.equals(value.getUserId())) {
				user = value;
				break;
			}
		}
		return user;
	}

}
