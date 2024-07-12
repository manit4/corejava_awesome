package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.util.ConnectionUtil;

@Configuration
@ComponentScan(basePackages = "com.spring.dao, com.spring.service, com.spring.util")
public class ApplicationConfig {
	
	@Bean
	public ConnectionUtil getConnectionUtil() {
		System.out.println("inside getConnectionUtil()");
		return new ConnectionUtil();
	}
	
	@Bean(name = "t1")
	public Thread getThread1() {
		System.out.println("inside getThread()1");
		
		Thread t1 = new Thread();     t1.setName("xi");
		return t1;
	}
	
	@Bean(name = "t2")
	public Thread getThread2() {
		System.out.println("inside getThread2()");
		
		Thread t1 = new Thread();     t1.setName("laurene");
		return t1;
	}
	
}
