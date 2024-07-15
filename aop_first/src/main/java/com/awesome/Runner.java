package com.awesome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awesome.service.AuthorizeService;
import com.awesome.service.PaymentService;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
		
		PaymentService service = context.getBean("paymentService", PaymentService.class);
		
		System.out.println(service);
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//PaymentService service = context.getBean("paymentService", PaymentService.class);
		
		//AuthorizeService authorizeService = context.getBean("authorizeService", AuthorizeService.class);
		
		//authorizeService.validateUser();
		
		//service.makePayment();
		
	}

}
