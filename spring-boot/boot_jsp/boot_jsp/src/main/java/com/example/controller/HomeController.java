package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;

@Controller//This @Controller is supposed to return HTML/JSP page but not plain text/JSON/XML Data....
public class HomeController {

	@GetMapping("/")// "/" represents the very first page of your application 
	public String homePage() {
		
		System.out.println("inside homePage()");
		
		return "index";//This String "index" is supposed to be the name of the html/jsp name. Do not expect
						//"index" as a string to be returned form the server as a plain text...
	}
	
	@GetMapping("/signup_page")
	public String signupPage() {
		
		System.out.println("inside signupPage()");
		
		return "signup_page";
	}
	
//	@PostMapping("/register")
//	public String registerUser(String username, String password, String cName, String email) {
//		
//		System.out.println("inside register()..."+username+", "+password+", "+cName+", "+email);
//		
//		return "index";
//	}
	
	@PostMapping("/register")
	public String registerUser(User user) {
		
		System.out.println("inside register()..."+user.getUsername()+", "+user.getPassword()+", "+user.getCName()+", "+user.getEmail());
		
		return "index";
	}
	
	
	
}
