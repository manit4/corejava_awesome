package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.User;

import lombok.val;

@Repository
public class UserRepositoryImpl implements IUserRepository {
	
	List<User> users = new ArrayList<>();
	
	public UserRepositoryImpl() {
		System.out.println("no-arg UserRepositoryImpl constr...");
	}
	
	@Override
	public void addUser(User signup) {
		
		System.out.println("before signup "+users.size());
		
		users.add(signup);
		
		System.out.println(users.size());
	}

	@Override
	public User findUser(String userId, String password) {
	
		User user = null;
		
		for( User value : users) {
			 
			if(value.getUsername().equals(userId) && value.getPassword().equals(password)) {
				
				user = value;
				break;
			}
		}
		
		return user;
	}

}
