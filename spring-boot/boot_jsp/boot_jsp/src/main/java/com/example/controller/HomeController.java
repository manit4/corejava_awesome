package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.jpa.entity.User;
import com.example.service.IUserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller//This @Controller is supposed to return HTML/JSP page but not plain text/JSON/XML Data....
public class HomeController {
	
	@Autowired
	IUserService userService;

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
	
//	@PostMapping("/register")
//	public String registerUser(User user) {
//		
//		System.out.println("inside register()..."+user.getUsername()+", "+user.getPassword()+", "+user.getCName()+", "+user.getEmail());
//		
//		return "index";
//	}
	
//	@PostMapping("/register")
//	public ModelAndView registerUser(User user) {
//		
//		System.out.println("inside register()..."+user.getUsername()+", "+user.getPassword()+", "+user.getCName()+", "+user.getEmail());
//		
//		userService.addUser(user);
//		
//		ModelAndView modelAndView = new ModelAndView("index");
//		modelAndView.addObject("registerSuccess", "Registration Successfull, Now Please Login!!");
//		
//		return modelAndView;
//	}
	
//	@PostMapping("/login")
//	public String login(String username, String password) {
//		
//		System.out.println(username+", "+password);
//		
//		String viewName = "index";
//		
//		User user = userService.login(username, password);
//		 if( user != null ) {
//			 
//			 viewName = "welcome_page";
//		 }
//		return viewName;
//	}
	
//	@PostMapping("/login")
//	public ModelAndView login(String username, String password, HttpServletRequest request) {
//		
//		System.out.println(username+", "+password+", and the request is "+request);
//		
//		ModelAndView modelAndView = null;
//		
//		User user = userService.login(username, password);
//		
//		System.out.println("Role is "+user.getRole());
//		 if( user != null ) {
//			 
//			 HttpSession session = request.getSession();
//			 System.out.println("session id while login is "+session.getId());
//			 
//			 modelAndView = new ModelAndView("welcome_page");
//			//modelAndView.addObject("loggedInUser", user);
//			 session.setAttribute("loggedInUser", user);
//		 }
//		 else {
//			 modelAndView = new ModelAndView("index");
//			 modelAndView.addObject("loginFailedStatus", "Login Failed, Please Try Again!!");
//		 }
//		return modelAndView;
//	}
	
	
	@PostMapping("/register")//With JPA
	public ModelAndView registerUser(User user) {
		
		System.out.println("inside register()..."+user.getUsername()+", "+user.getPassword()+", "+user.getCName()+", "+user.getEmail()+", "+user.getRole());
		
		userService.addUser(user);
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("registerSuccess", "Registration Successfull, Now Please Login!!");
		
		return modelAndView;
	}
	
	
	
	
}
