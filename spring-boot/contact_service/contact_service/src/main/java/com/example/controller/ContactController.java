package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ContactDAO;
import com.example.model.Contact;

import jakarta.websocket.server.PathParam;

@RestController
public class ContactController {
	
	@Autowired
	ContactDAO contactDAO;
	
	@GetMapping("/getContact/{userId}")
	public Contact getContact(@PathVariable String userId) {
		System.out.println("inaside getContact() of ContactController "+userId);
		
		System.out.println("Contact is "+contactDAO.getContact(userId).orElse(null));
		
		return contactDAO.getContact(userId).orElse(null);
	}

}
