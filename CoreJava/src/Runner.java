class Human {
	
	int iq = 4;
	
	void study() {
		
		iq++;
	}
}

class SuperHuman extends Human {
	
	int altitude = 0;
	
	void fly() {
		
		altitude = 1000;
	}
}

public class Runner {
	
	public static void main(String[] args) {

		SuperHuman superHuman = new SuperHuman();
		
		System.out.println(superHuman.iq);
		System.out.println(superHuman.altitude);
		
		superHuman.fly();
		System.out.println(superHuman.altitude);	
		
	}
}

//class Human {
//	
//	int iq = 4;
//	
//	void study() {
//		
//		iq++;
//	}
//}
//
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Human manit = new Human();
//		
//		System.out.println(manit.iq);
//		
//		manit.study();
//		
//		System.out.println(manit.iq);
//		
//	}
//}



//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Car");
//	}
//	void abs() {
//		
//		System.out.println("inside abs() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//	
//	void climateControl() {
//		
//		System.out.println("inside climateControl of Polo");
//	}
//	void antiBraking() {
//		
//		System.out.println("inside antiBraking of Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Car car = new Car();    
//		car.steeringWheel();
//		car.abs();
//		
//		System.out.println(car.i);
//		
//		Polo polo = new Polo();
//		polo.antiBraking();
//		polo.climateControl();					
//		polo.abs();   polo.steeringWheel();	
//		
//		System.out.println(polo.i);
//		System.out.println(polo.j);
//	}
//}


//class Car {
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Car");
//	}
//	void abs() {
//		
//		System.out.println("inside abs() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void climateControl() {
//		
//		System.out.println("inside climateControl of Polo");
//	}
//	void antiBraking() {
//		
//		System.out.println("inside antiBraking of Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Car car = new Car();    
//		car.steeringWheel();
//		car.abs();
//		//car.antiBraking(); //calling antiBraking is illegal since antiBraking() does not belong to 
//							//class Car and does not belong even to parent class of Class Car..
//		
//		Polo polo = new Polo();//here on Polo Object, you can call members of its own class
//								//as well as members of its parent class...
//		polo.antiBraking();
//		polo.climateControl();					
//		polo.abs();   polo.steeringWheel();	
//	}
//}



//class Car {
//	
//	void steeringWheel() {
//		
//		System.out.println("inside steeringWheel() of Car");
//	}
//	void abs() {
//		
//		System.out.println("inside abs() of Car");
//	}
//}
//
//class Polo  {
//	
//	void climateControl() {
//		
//		System.out.println("inside climateControl of Polo");
//	}
//	void antiBraking() {
//		
//		System.out.println("inside antiBraking of Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Car car = new Car();     car.steeringWheel();   car.abs();
//		Polo polo = new Polo();  polo.antiBraking();     polo.climateControl();
//		
//	}
//
//}
