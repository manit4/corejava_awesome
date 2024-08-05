package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.model.CustomUserDetails;
import com.example.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> optional = userRepository.findById(username);
		
		System.out.println("inside loadUserByUsername()...");
		
		User user = null;
		
		if( optional.isPresent() ) {
			System.out.println("insdei if of loadUserByUsername()");
			user = optional.get();
		}
		
		return new CustomUserDetails(user);
	}

}
