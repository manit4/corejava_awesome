package com.awesome.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthorizeService {//AuthorizeService is an Aspect
	
	@Before("execution(* com.awesome.service.PaymentService.makePayment())")
	public void validateUser() {//validateUser() is an advice
		
		System.out.println("User is getting verified....");
		
		System.out.println("User is Verified....");
	}

}
