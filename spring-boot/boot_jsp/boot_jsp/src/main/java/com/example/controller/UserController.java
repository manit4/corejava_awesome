package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

		System.out.println("inside delete() " + userId);

		userService.deleteUser(userId);

		List<User> users = userService.getAllUsers();

		ModelAndView modelAndView = new ModelAndView("master_page");
		modelAndView.addObject("users", users);

		return modelAndView;
	}

	@GetMapping("/update_page/{userId}")
	public ModelAndView updateUserPage(@PathVariable String userId) {

		System.out.println("inside delete() " + userId);

		User user = userService.findUser(userId);

		ModelAndView modelAndView = new ModelAndView("update_user");

		modelAndView.addObject("user", user);

		return modelAndView;
	}

	@PostMapping("/update")
	public ModelAndView updateUser(User user) throws InterruptedException {

		System.out.println(user.getUsername() + ", " + user.getCName());
		
		userService.updateUser(user);

		List<User> users = userService.getAllUsers();

		ModelAndView modelAndView = new ModelAndView("master_page");
		modelAndView.addObject("users", users);
		modelAndView.addObject("updateMsg", "Update is Done");
		
		return modelAndView;
	}
}
