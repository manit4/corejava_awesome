package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/delete/{userId}")
	public ModelAndView deleteUser(@PathVariable String userId) {
		
		System.out.println("inside delete() "+userId);
		
		userService.deleteUser(userId);
		
		List<User> users = userService.getAllUsers();
		
		ModelAndView modelAndView = new ModelAndView("master_page");
		modelAndView.addObject("users", users);
		
		return modelAndView;
	}

}
