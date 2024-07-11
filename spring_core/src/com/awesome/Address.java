package com.awesome;

public class Address {
	
	private String addressId;
	private String city;
	private String state;
	
	public Address() {
		System.out.println("no-arg address constr");
	}

	public Address(String addressId, String city, String state) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		System.out.println("setter id");
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setter city");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("setter state");
		this.state = state;
	}
}
