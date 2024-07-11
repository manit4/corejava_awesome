package com.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.pojo.User;
import com.spring.service.UserService;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		
		boolean flag = true;
		
		while(flag) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1 for Add User, 2 for Search User and 0 for Exit...");
			int mainInput = sc.nextInt();
			
			switch (mainInput) {
			case 1:
				
				System.out.println("Enter your Id!!");
				String id = sc.next();
				
				System.out.println("Enter your Name!!");
				String name = sc.next();
				
				User user = new User(id, name);
				
				userService.saveUser(user);
				
				break;
				
			case 2:
				
				System.out.println("Enter the UserId");
				String userId = sc.next();
				
				User returnedUser = userService.searchUser(userId);
				
				if( returnedUser != null ) {
					
					System.out.println(returnedUser);
				}
				else {
					System.out.println("No User Found...");
				}
				
				break;
			case 0 :

				flag = false;
				break;
			
			}
		}
	}

}
