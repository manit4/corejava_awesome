package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.service.IUserService;

@Controller
public class MasterController {
	
	@Autowired
	IUserService userService;
	
//	@GetMapping("/master")
//	public String masterModule() {
//		
//		System.out.println("inside masterModule()");
//		
//		return "master_page";
//	}
	
	
	@GetMapping("/master")
	public ModelAndView masterModule() {
		
		System.out.println("inside masterModule()");
		
		List<User> users = userService.getAllUsers();
		
		ModelAndView modelAndView = new ModelAndView("master_page");
		modelAndView.addObject("users", users);
		
		return modelAndView;
	}

}
