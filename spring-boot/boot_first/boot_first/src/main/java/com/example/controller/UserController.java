package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/msg")
	public String firstMessage() {
		
		return "I am home page from firstMessage()";
	}
	
	@GetMapping("/second")
	public String secondMsg() {
		
		return "I am second Message and I am updating after dev-tools it ofr the third time";
	}

	@GetMapping("/third")
	public String thirdMsg() {
		
		return "I am the third Message";
	}
}
