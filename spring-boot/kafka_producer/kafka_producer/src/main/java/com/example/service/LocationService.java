package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.model.Location;

@Service
public class LocationService {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public String updating(Location location) {
		
		kafkaTemplate.send("delivery-topic", location.getLongitude()+location.getLatitude());
		
		return "Location Updated";
	}

}
