package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dao.UserDAO;
import com.example.model.Contact;
import com.example.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getUser/{userId}")
	public User getUser( @PathVariable String userId ) throws InterruptedException {
		
		System.out.println("The User Id is "+userId);
		
		Optional<User> optional = userDAO.findUser(userId);
		
		User user = null;
		
		if( optional.isPresent() ) {
			
			user = optional.get();
			
//			Contact contact = restTemplate.getForObject("http://localhost:8081/getContact/"+userId, Contact.class);
			Contact contact = restTemplate.getForObject("http://contact-service/getContact/"+userId, Contact.class);
			System.out.println("contact is "+contact.getContactId()+", "+contact.getCity());
			user.setContact(contact);
		}
		
		return user;
	}
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		
		List<User> users = userDAO.allUsers();
		
		ArrayList<Contact> contacts = restTemplate.getForObject("http://localhost:8081/allContacts", ArrayList.class);
		
		System.out.println("size is "+contacts.size());
		
		contacts.forEach(con -> System.out.println(con));
		
		return users;
	}

}
