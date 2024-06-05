////below is the example of multiple inheritance and is not legal in Java....
//class A {
//	
//}
//
//class B {
//	
//}
//
//class C extends B, A {
//	
//}
//
//
//
////here is the example of multi-level inheritance
//class A {
//	
//	
//}
//
//class B extends A {
//	
//}
//
//class C extends B {
//	
//	
//}
//public class Runner {
//	
//	public static void main(String[] args) {
//	
//		
//	}
//}



abstract class Car {
	
	void tires() {
		System.out.println("inside tyres() of Car");
	}
	
	abstract void engine();//if you have even 1 abstract method then class must be declared abstract
				//however, if you do not have any abstract method or all methods are implemented then its your choice to make that
				//class abstract or not...
	
}

class ImaginaryPolo extends Car {
	
	void abs() {
		System.out.println("inside abs() of ImaginaryPolo");
	}
	void engine() {
		System.out.println("inside engine() of ImaginaryPolo");
	}	
}


public class Runner {
	
	public static void main(String[] args) {
	
		
	}
}




//
//
//abstract class Car {
//	
//	void tires() {
//		System.out.println("inside tyres() of Car");
//	}
//	
//	abstract void engine();
//	abstract void musicSystem();
//}
//
//abstract class ImaginaryPolo extends Car {
//	
//	void abs() {
//		System.out.println("inside abs() of ImaginaryPolo");
//	}
//	void engine() {
//		System.out.println("inside engine() of ImaginaryPolo");
//	}	
//}
//
//class Polo extends ImaginaryPolo {
//	
//	void musicSystem() {
//		System.out.println("inside musicSystem() of Polo");	
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//	
//		Polo polo = new Polo();   
//		Car car = new Polo();
//		ImaginaryPolo imaginaryPolo = new Polo();
//	}
//}




//
//abstract class Car {
//	
//	void tires() {
//		System.out.println("inside tyres() of Car");
//	}
//	void musicSystem() {
//		System.out.println("inside musicSystem() of Car");
//	}
//	abstract void engine();//engine does not have a body and is used with keyword abstract
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Polo");
//	}
//	void engine() {//here I am implementing the abstract engine() of Car since child class has to 
//					//implement all the abstract method/s of its parent class. Or if child class can not
//					//give implementation to all of the parent class abstract method/s of its parent 
//					//class then child class must be marked abstract which we will see in the above example...
//					
//		System.out.println("inside engine() of Polo");
//	}	
//}
//
//class Benz extends Car {
//
//	void engine() {
//		System.out.println("inside engine() of Benz");
//	}
//	void climateControl() {
//		System.out.println("inside climateControl() of Benz");
//	}
//	void tires() {
//		System.out.println("inside tires() of Benz");
//	}
//	
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		polo.abs();   polo.musicSystem();    polo.engine();  polo.tires();
//		
//		Benz benz = new Benz();
//		benz.tires();   benz.climateControl();   benz.engine();    benz.musicSystem();
//	}
//}




//abstract class Car {
//	
//	void tires() {
//		System.out.println("inside tyres() of Car");
//	}
//	void musicSystem() {
//		System.out.println("inside musicSystem() of Car");
//	}
//	abstract void engine();//engine does not have a body and is used with keyword abstract
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Polo");
//	}
//	void engine() {
//		System.out.println("inside engine() of Polo");
//	}	
//}
//
//class Benz extends Car {
//
//	void engine() {
//		System.out.println("inside engine() of Benz");
//	}
//	void climateControl() {
//		System.out.println("inside climateControl() of Benz");
//	}
//	
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		polo.abs();   polo.musicSystem();    polo.engine();  polo.tires();
//		
//		Benz benz = new Benz();
//		benz.tires();   benz.climateControl();   benz.engine();    benz.musicSystem();
//	}
//}


//abstract class Car {//you can not create object of abstract class and even if you do not have abstract
				//method in the class but you can create the class abstract ...
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel() of Car");
//	}
//	void tires() {
//		System.out.println("inside tyres() of Car");
//	}
//	void body() {
//		System.out.println("inside body of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Polo");
//	}
//	void engine() {
//		System.out.println("inside engine() of Polo");
//	}
//}
//
//class Benz extends Car {
//	
//	void climateControl() {
//		System.out.println("inside climateControl() of Benz");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();//Object of abstract class can not be created, it is illegal
//		Polo polo = new Polo();
//		Benz benz = new Benz();
//		
//		Car c1 = new Polo();//as we know that we can not create object of abstract class but we can use 
//							//abstract class as a reference variable which will hold the object of child class...
//		Car c2 = new Benz();
//		
//	}
//}




//final class Human {//Final class cannot be extended by any class
//	
//	void walk() {
//		
//	}
//	void talk() {
//		
//	}
//	void sleep() {
//		
//	}
//}
//
//class SuperHuman extends Human {//this is illegal since I am trying to extend the final class. Final
//		//class can not be extended...
//	
//	void fly() {
//		
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		SuperHuman human = new SuperHuman();
//		
//	}
//}




//class Car {
//	
//	final void steeringWheel() {//final methods can not be overridden...
//		
//		System.out.println("inside steeringWheel of Car");
//	}
//	void climateControl() {
//		
//		System.out.println("inside climateControl() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		
//		System.out.println("inside abs() of Polo");
//	}
//
//	void steeringWheel() {//You are trying to override the final method which is illegal
//
//		System.out.println("inside steeringWheel of Polo");
//	}	
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();    polo.steeringWheel();    polo.climateControl();   polo.abs();   
//		
//	}
//}



//class A {
//	
//	final int i = 4;//final variable is not changeable
//	final int j;//this is again illegal since you can not leave any final variable uninilialised and you 
//				//have to assign some value to it...
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		A a = new A();
//		
//		a.i = 10;//here this is illegal since I am trying to change the final variable value
//		
//		System.out.println(a.i);
//		
//		
//	}
//}



//class SystemA {
//	
//	static PrintStreamB out = new PrintStreamB(); 
//}
//
//class PrintStreamB {
//	
//	void print() {
//		
//		System.out.println("inside println() of B class");
//	}
//	void print(boolean b) {
//		System.out.println(b);
//	}
//	void print(String s) {
//		
//		System.out.println(s);
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
////		PrintStreamB b = new PrintStreamB();
////		b.println();
//		
//		
//		SystemA.out.print();
//		SystemA.out.print(false);
//		SystemA.out.print("abcd");
//		
//		
//	}
//}



//class Arithmetic {
//	
//	void add(int i, int j) {
//		
//		System.out.println( i+j );
//	}
//	void add(int i, int j, int k) {
//		
//		System.out.println( i+j+k );
//	}
//	
//	void add(double d1, double d2) {
//		
//		System.out.println( d1+d2 );
//	}
//	
//	String add(String s1, String s2) {
//		
//		return s1+s2;
//	}	
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Arithmetic arithmetic = new Arithmetic();
//		
//		arithmetic.add(100, 200);
//		arithmetic.add(1, 2, 3);
//		arithmetic.add(12.34, 32.56);
//		
//		String returnedValue = arithmetic.add("123", "345");
//		System.out.println(returnedValue);
//	}
//}


//public class Runner {
//	
//	public static void main(String[] args) {
//		
////		int i = 4, j = 5;
////		
////		System.out.println( i+j );
////		
////		String s1 = "Abc";
////		String s2 = "Bcd";
////		
////		System.out.println( s1+s2 );
//		
//		
//		String s = "Abc";
//		int i = 4;
//		int j = 5;
//		
//		System.out.println( i+j+s );//Output would be 9Abc
//		System.out.println( s+i+j );//output would be Abc45
//		
//		
//	}
//}





//class Arithmetic {//This is overloading. In this, more than one method name must be the same and paremeters
//				//list must be different in the same class but does not matter with the return-type(could be same and could be different...
//	
//	void add(int i, int j) {
//		
//		System.out.println( i+j );
//	}
//	void add(int i, int j, int k) {
//		
//		System.out.println( i+j+k );
//	}
//	
//	void add(double d1, double d2) {
//		
//		System.out.println( d1+d2 );
//	}
//	
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Arithmetic arithmetic = new Arithmetic();
//		
//		arithmetic.add(100, 200);
//		arithmetic.add(1, 2, 3);
//		arithmetic.add(12.34, 32.56);
//	}
//}



//class Human {//This is the example of overriding. When you have same signature(name, return-type and parameters) methods in Parent as well
//				//as in the Child class then it is called overriding...
//	
//	void talk() {
//		System.out.println("inside talk of Human class");
//	}
//	void run() {
//		System.out.println("inside run of Human class");
//	}
//
//}
//
//class SuperHuman extends Human {
//	
//	void fly() {
//		System.out.println("inside fly of SuperHuman class");
//	}
//	void run() {
//		System.out.println("inside run of SuperHuman class");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		SuperHuman human = new SuperHuman();
//		human.talk();    human.run();     human.fly();   
//	}
//}



//class Car {
//	
//	int i = 4;
//	
//	public void steeringWheel() {
//		
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//	
//	void abs() {
//		
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Car car = new Polo();
//		System.out.println(car.i);
//		System.out.println(car.j);//here this is illegal. why? since when you have an object of Child class
//		//in the reference variable of parent class then you have to check the reference variable type and the
//				//member(variable as well as method) must exist in the class of reference variable type...
//		
//	}
//}



//class Car {
//	
//	public void steeringWheel() {
//		
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();
//		
//		Car car = new Polo();
//		
//		Car upCastedVariable = car;//Up-Casting is automatic
//		
//		
//		
//	}
//}



//class Car {
//	
//	public void steeringWheel() {
//		
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//	Car car1 = new Car();   Car car2 = new Car();
//	Car[] cars = { car1, car2 };
//	
//	Polo polo1 = new Polo();    Polo polo2 = new Polo();
//	Polo[] polos = { polo1, polo2 };
//				 
//	Polo[] kars = { car1, polo1, car2, polo2 };//This i not legal, since you are trying to hold objects of class Car(car1, car2)
//			//in the reference variable of Polo class. The reason is, you can not hold the object of 
//			//parent class in the reference variable of Child type...
//	
//	for(Car car : kars) {
//		
//		car.steeringWheel();
//		
//		if( car instanceof Polo ) {
//			
//			System.out.println("inside if");
//			
//			Polo polo = (Polo) car;
//			polo.abs();
//		}
//	}
//		
//	}
//}




//class Car {
//
//	public void steeringWheel() {
//
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		Car car1 = new Car();
//		Car car2 = new Car();
//		Car[] cars = { car1, car2 };
//
//		Polo polo1 = new Polo();
//		Polo polo2 = new Polo();
//		Polo[] polos = { polo1, polo2 };
//
//		Car[] kars = { car1, polo1, car2, polo2 };
//
//		for (Car car : kars) {
//
//			car.steeringWheel();
//
//			if (car instanceof Polo) {
//
//				System.out.println("inside if");
//
//				Polo polo = (Polo) car;
//				polo.abs();
//			}
//		}
//
//	}
//}



//class Car {
//	
//	public void steeringWheel() {
//		
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Car car = new Polo();
//		
//		
//		Polo polo = new Car();//You can not have object of Parent in the reference variable of Child type... 
//		 
//		 
//		 
//				 
//				
//		
//	}
//}




//Below is the code for Type-Casting.... 

//class Car {
//	
//	int i = 4;
//	
//	public void steeringWheel() {
//		
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//	
//	void abs() {
//		
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();    polo.steeringWheel();      polo.abs();
//		
//		Car car2 = new Polo();    car2.steeringWheel();       // car2.abs();//this is not legal...
//		
//		Polo castedVariable = (Polo) car2;    castedVariable.steeringWheel();   castedVariable.abs(); 
//				
//		
//	}
//}


//class Car {
//	
//	public void steeringWheel() {
//		
//		System.out.println("Inside steeringWheel() of class Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		
//		System.out.println("Inside abs() of class Polo");
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		Car car = new Car();     car .steeringWheel();
//		Polo polo = new Polo();    polo.abs();    polo.steeringWheel();
//		
//		Car car2 = new Polo();    car2.steeringWheel();     
//		//car2.abs();this is illegal, why?---- when you the situation of Child class object being held
//		//by the reference variable of Parent class then you have to check the type/class of reference variable
//		//and if the member you are calling exists in that reference variable type class then it is legal otherwise, not legal... 
//		
//	}
//}


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
//class SuperHuman extends Human {
//	
//	int iq = 10;
//	
//	void fly() {
//		
//		int iq = 6;
//		
//		System.out.println(iq);//output is 6
//		System.out.println(this.iq);//output is 10
//		System.out.println(super.iq);//output is 4
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		SuperHuman human = new SuperHuman();
//		
//		human.fly();
//	}
//}


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
//class SuperHuman extends Human {
//	
//	int iq = 10;
//	
//	void fly() {
//		
//		System.out.println(super.iq);
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		SuperHuman human = new SuperHuman();
//		
//		human.fly();
//	}
//}


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
//class SuperHuman extends Human {
//	
//	int iq = 10;
//	
//	void fly() {
//		
//		System.out.println(iq);//here in this example, you would get iq as 10 even though
//						//we have iq variable in the child class as well as in the parent class
//						//But it gives priority to the child class variable by default. However, 
//					//we can change this by default behavior...
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		SuperHuman superHuman = new SuperHuman();
//		
//		superHuman.fly();
//		
//	}
//}



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
//class SuperHuman extends Human {
//	
//	int altitude = 0;
//	
//	void fly() {
//		
//		altitude = iq * 1000;//in the Child class methods, you can access the members of its own class as well
						//as the members of parent class
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		SuperHuman superHuman = new SuperHuman();
//		
//		System.out.println(superHuman.iq);
//		System.out.println(superHuman.altitude);
//		
//		superHuman.fly();
//		System.out.println(superHuman.altitude);	
//		
//	}
//}




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
//class SuperHuman extends Human {
//	
//	int altitude = 0;
//	
//	void fly() {
//		
//		altitude = iq * 1000;
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		SuperHuman superHuman = new SuperHuman();
//		
//		System.out.println(superHuman.iq);
//		System.out.println(superHuman.altitude);
//		
//		superHuman.fly();
//		System.out.println(superHuman.altitude);	
//		
//	}
//}





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
//class SuperHuman extends Human {
//	
//	int altitude = 0;
//	
//	void fly() {
//		
//		altitude = 1000;
//	}
//}
//
//public class Runner {
//	
//	public static void main(String[] args) {
//
//		SuperHuman superHuman = new SuperHuman();
//		
//		System.out.println(superHuman.iq);
//		System.out.println(superHuman.altitude);
//		
//		superHuman.fly();
//		System.out.println(superHuman.altitude);	
//		
//	}
//}

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
