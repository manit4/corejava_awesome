package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//This @Controller is supposed to return HTML/JSP page but not plain text/JSON/XML Data....
public class HomeController {

	@GetMapping("/index")
	public String homePage() {
		
		System.out.println("inside homePage()");
		
		return "index";//This String "index" is supposed to be the name of the html/jsp name. Do not expect
						//"index" as a string to be returned form the server as a plain text...
	}
}
