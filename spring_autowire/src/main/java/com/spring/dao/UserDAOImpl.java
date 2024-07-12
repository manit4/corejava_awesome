package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.pojo.User;

@Repository
public class UserDAOImpl implements IUserDAO {
	
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

	public List<User> allUsers() {
		
		return users;
	}

}
