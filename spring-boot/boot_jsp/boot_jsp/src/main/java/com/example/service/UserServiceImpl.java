package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.entity.User;
import com.example.jpa.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	

	
	@Autowired
	IUserRepository userRepository;

	@Override
	public String addUser(User user) {
		
		userRepository.save(user);
		
		return "User Saved";
	}

//	@Autowired
//	IUserRepository userRepository;
	
//	@Override
//	public String addUser(User user) {
//		
//		return userRepository.addUser(user);
//	}
//
//	@Override
//	public User login(String username, String password) {
//		
//		return userRepository.findUser(username, password);
//	}
//
//	@Override
//	public List<User> getAllUsers() {
//		
//		return userRepository.allUsers();
//	}
//
//	@Override
//	public String deleteUser(String userId) {
//		
//		return userRepository.delete(userId);
//	}
//
//	@Override
//	public User findUser(String username) {
//
//		return userRepository.findUser(username);
//	}
//
//	@Override
//	public void updateUser(User user) {
//		
//		userRepository.updateUser(user);
//		
//	}

}
