package com.awesome.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AuthorizeService {//AuthorizeService is an Aspect
	
	@Before("execution(* com.awesome.service.PaymentService.makePayment())")
	public void validateUser() {//validateUser() is an advice
		
		System.out.println("User is getting verified....");
		
		System.out.println("User is Verified....");
	}
	
	@After("execution(* com.awesome.service.PaymentService.makePayment())")
	public void closingResources() {//validateUser() is an advice
		
		System.out.println("Resources Closing....");
	}

}
















































//
//<!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
//	<dependency>
//		<groupId>org.springframework</groupId>
//		<artifactId>spring-core</artifactId>
//		<version>4.3.5.RELEASE</version>
//	</dependency>
//
//	<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
//	<dependency>
//		<groupId>org.springframework</groupId>
//		<artifactId>spring-context</artifactId>
//		<version>4.3.5.RELEASE</version>
//	</dependency>
//
//	<!-- https://mvnrepository.com/artifact/org.springframework/spring-aop -->
//	<dependency>
//		<groupId>org.springframework</groupId>
//		<artifactId>spring-aop</artifactId>
//		<version>4.3.5.RELEASE</version>
//	</dependency>
//
//	<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
//	<dependency>
//		<groupId>org.aspectj</groupId>
//		<artifactId>aspectjweaver</artifactId>
//		<version>1.8.9</version>
//		<!--<scope>runtime</scope>-->
//	</dependency>
//
//	<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjrt -->
//	<dependency>
//		<groupId>org.aspectj</groupId>
//		<artifactId>aspectjrt</artifactId>
//		<version>1.8.9</version>
//		<!--<scope>runtime</scope>-->
//	</dependency>