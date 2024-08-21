package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@GetMapping("/allEmployees")
	public List allEmployees() {
		
		Employee employee1 = new Employee("e_01", "Eileen");
		Employee employee2 = new Employee("e_02", "Xi");
		
		List employees = List.of(employee1, employee2);
		
		return employees;
	}

}
