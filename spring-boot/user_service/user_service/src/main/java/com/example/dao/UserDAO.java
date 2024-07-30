package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserDAO {
	
	List<User> users;

	public UserDAO() {
		
		users = new ArrayList<>();
		
		User user1 = new User("100", "123", "Jingjing", "jing@gmail.com", null);
		User user2 = new User("101", "234", "Xi", "xi@gmail.com", null);
		User user3 = new User("102", "345", "Zhen Luo", "zhen@yahoo.com",  null);
		
		users.add(user1);   users.add(user2);    users.add(user3);
	}
	
	public Optional<User> findUser(String userId) {
		
		return users.stream().filter(user -> user.getUserId().equals(userId)).findFirst();
		
	}
	
	public List<User> allUsers() {
		
		return users;
	}
}
