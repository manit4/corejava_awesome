package com.awesome;

public class Employee {
	
	private Address address;

	public Employee() {
		System.out.println("no-arg constr Employee");
	}

	public Employee(Address address) {
		super();
		System.out.println("inside Employee parameterised constr");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside setAddress of Employee...");
		this.address = address;
	}
}
