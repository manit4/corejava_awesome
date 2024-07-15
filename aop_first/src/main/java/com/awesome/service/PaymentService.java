package com.awesome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	public void makePayment() {
		
		System.out.println("Payment started debiting from the Customer' Account...");
		
		System.out.println("Payment credited to the Merchant' Account...");
	}

}



//@Service
//public class PaymentService {
//	
//	@Autowired
//	AuthorizeService authorizeService;
//	
//	public void makePayment() {
//		
//		authorizeService.validateUser();
//		
//		System.out.println("Payment started debiting from the Customer' Account...");
//		
//		System.out.println("Payment credited to the Merchant' Account...");
//	}
//
//}
