package com.chinese.pojo;

import org.springframework.stereotype.Repository;

import com.chinese.awesome.Address;

//@Repository
//public class Employee {
//	
//	private Address address;
//
//	public Employee() {
//		System.out.println("no-arg constr Employee");
//	}
//
//	public Employee(Address address) {
//		System.out.println("parameterised Employee constr");
//		this.address = address;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//}




//@Component
//@Controller
//@Service
@Repository
public class Employee {
	
	private String empId;
	private String name;
	public Employee() {
		System.out.println("inside no-arg Emp constr");
	}
	public Employee(String empId, String name) {
		System.out.println("inside parameterised constr of Emp");
		this.empId = empId;
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
