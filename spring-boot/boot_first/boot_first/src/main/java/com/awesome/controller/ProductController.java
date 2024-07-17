package com.awesome.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/")
public class ProductController {
	
	public ProductController() {
		System.out.println("inside no-arg ProductController");
	}
	
	@DeleteMapping("deleteAll")
	public void delete() {
		
		System.out.println("inside delete");
	}

}
