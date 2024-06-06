package com.infosys;//if class is part of a package, then package statement must be the first statement...

import com.infosys.pojo.Human;

public class Runner {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		
//		System.out.println(car.i);
//		
//		User user = new User();
//		System.out.println(user.username);
//		
//		Car car1 = new Car();
//		car1.printUsername();
		
		
		Human human = new Human();
		human.setIq(200);
		System.out.println(human.getIq());
		
		
		
		
		
		
		
	}
}
//class can be either public or default