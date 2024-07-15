package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.awesome, com.example")
public class BootFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootFirstApplication.class, args);
	}
	
	@Bean
	public Thread getThread() {
		
		System.out.println("inside getThread()...");
		
		return new Thread();
	}

}
