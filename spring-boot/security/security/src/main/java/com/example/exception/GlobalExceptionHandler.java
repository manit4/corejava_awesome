package com.example.exception;

import java.util.ConcurrentModificationException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NullPointerException.class)
	public String nullPointerHandler() {
		
		return "Hiiii";
	}
	
	@ExceptionHandler(ConcurrentModificationException.class)
	public String internalServerHandler() {
		
		return "I am handling Exception through Global Handler";
	}

}
