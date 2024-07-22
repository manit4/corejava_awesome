package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
	
	private String username;
	private String password;
	private String cName;
	private String email;
	
	public String toString() {
		
		return username+", "+password+", "+cName+", "+email;
	}
}
