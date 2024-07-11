package com.chinese.awesome;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String addressId;
	private String city;
	
	public Address() {
		System.out.println("inside no-arg constr of Address");
	}
	public Address(String addressId, String city) {
		System.out.println("inside parameterised constr of Address");
		this.addressId = addressId;
		this.city = city;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
