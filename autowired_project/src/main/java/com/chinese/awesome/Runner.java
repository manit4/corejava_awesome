package com.chinese.awesome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chinese.pojo.Employee;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println("hi");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Address address = context.getBean("address", Address.class);
		System.out.println(address.getAddressId()+", "+address.getCity());
		
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.getEmpId()+", "+employee.getName());
	}

}
