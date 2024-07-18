package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {
	
	@GetMapping("/master")
	public String masterModule() {
		
		System.out.println("inside masterModule()");
		
		return "master_page";
	}

}
