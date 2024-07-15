package com.awesome.service;

import org.springframework.stereotype.Service;

public class PaymentService {
	
	public void makePayment() {
		
		System.out.println("Payment started debiting from the Customer' Account...");
		
		System.out.println("Payment credited to the Merchant' Account...");
	}

}
