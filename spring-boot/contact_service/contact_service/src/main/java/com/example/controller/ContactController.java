package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ContactDAO;
import com.example.model.Contact;

@RestController
@RequestMapping("/contact/")
public class ContactController {
	
	@Autowired
	ContactDAO contactDAO;
	
	@GetMapping("/getContact/{userId}")
	public Contact getContact(@PathVariable String userId) {
		System.out.println("inaside getContact() of ContactController "+userId);
		
		System.out.println("Contact is "+contactDAO.getContact(userId).orElse(null));
		
		return contactDAO.getContact(userId).orElse(null);
	}
	
	@GetMapping("/allContacts")
	public List<Contact> getAllContact() {
		
		return contactDAO.allContacts();
	}
}
