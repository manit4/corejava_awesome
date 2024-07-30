package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.model.Contact;

@Repository
public class ContactDAO {
	
	List<Contact> contacts;

	public ContactDAO() {
		
		contacts = new ArrayList<>();
		
		
		Contact contact1 = new Contact("c_1", "Shanghai", "100");
		Contact contact2 = new Contact("c_2", "Beijing", "101");
		Contact contact3 = new Contact("c_3", "Mumbai", "102");
		
		contacts.add(contact1);   contacts.add(contact2);   contacts.add(contact3);
	}
	
	public Optional<Contact> getContact(String userId) {
		
		return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).findFirst();
	}
	
	public List<Contact> allContacts() {
		
		return contacts;
	}
}
