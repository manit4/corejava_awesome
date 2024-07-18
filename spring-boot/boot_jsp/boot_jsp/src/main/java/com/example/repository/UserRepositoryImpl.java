package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserRepositoryImpl implements IUserRepository {
	
	List<User> users = new ArrayList<>();

	@Override
	public String addUser(User user) {
		
		users.add(user);
		
		System.out.println("Size of Users is "+users.size());
		
		return "User is added";
	}

	@Override
	public User findUser(String username, String password) {
		
		User user = null;
		
		for( User val : users ) {
			
			if( val.getUsername().equals(username) && val.getPassword().equals(password)) {
				
				user = val;
				break;
			}
		}
		
		return user;
	}

}
