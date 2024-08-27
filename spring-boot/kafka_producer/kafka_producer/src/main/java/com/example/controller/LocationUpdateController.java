package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Location;
import com.example.service.LocationService;

@RestController
public class LocationUpdateController {
	
	@Autowired
	LocationService locationService;

	@PostMapping("/update")
	public String locationUpdate(@RequestBody Location location) {
		
		System.out.println("Location is "+location);
		
		locationService.updating(location);
		
		return "Location Updated";
	}
}
