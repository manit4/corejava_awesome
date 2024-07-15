package com.awesome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awesome.config.ApplicationConfig;
import com.awesome.service.AuthorizeService;
import com.awesome.service.PaymentService;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		PaymentService service = context.getBean("paymentService", PaymentService.class);
		
		service.makePayment();
		
	}

}
