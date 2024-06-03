import java.util.*;


class Task {

	int taskId;
	String taskname;
}
	
class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		Task[] tasks = new Task[3];

		for(int i = 0; i < tasks.length; i++) {

			Task task = new Task();
			
			System.out.println("Enter the TaskId!");
			int tId = sc.nextInt();

			System.out.println("Enter the TaskName!");
			String tname = sc.next();

			task.taskId = tId;     task.taskname = tname;
			tasks[i] = task;

		}
	
		for(int i = 0; i < tasks.length; i++) {

			System.out.println(tasks[i].taskId+" and the task name is "+tasks[i].taskname);
		}		
	}			
}



	
/*class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String[] tasks = new String[5];

		for(int i = 0; i < 5; i++) {

			System.out.println("Enter the Task!");

			String task = sc.next();

			tasks[i] = task;
		}

		for(String task : tasks) {

			System.out.println(task);
		}						
	}			
}
*/



/*class Car {

	void steeringWheel() {

		System.out.println("inside steeringWheel() of Car");
	}
}

class Polo extends Car {

	
	void abs() {

		System.out.println("inside abs() of Polo");
	}
}

class Camry extends Car {

	void antiBraking() {
 	
		System.out.println("inside abs() of Camry");
	}
}
	
class Main {

	public static void main(String args[]) {

		Polo polo = new Polo();   polo.steeringWheel();    polo.abs();
		Camry camry = new Camry();     camry.steeringWheel();     camry.antiBraking();
		Car car = new Car();     car.steeringWheel();							
	}			
}

*/



/*class Polo {

	void steeringWheel() {

		System.out.println("inside steeringWheel() of Polo");
	}
	void abs() {

		System.out.println("inside abs() of Polo");
	}
}

class Camry {

	void steeringWheel() {

		System.out.println("inside steeringWheel() of Camry");
	}
	void antiBraking() {
 	
		System.out.println("inside abs() of Camry");
	}
}
	
class Main {

	public static void main(String args[]) {

	Polo polo = new Polo();        polo.steeringWheel();    polo.abs();     polo.antiBraking();//calling antiBraking on Polo object is 											//illegal since antiBraking() does not belong to Polo class
        Camry camry = new Camry();     camry.steeringWheel();   camry.antiBraking();
									
	}			
}
*/


/*class Maths {

	static void sum(int firstNo, int secondNo) {

		System.out.println(firstNo + secondNo);
	}

	static void sub(int firstNo, int secondNo) {

		System.out.println(firstNo - secondNo);
	}	
}

class Another {

	static void divide() {

		System.out.println("inside divide");
	}

}

class Main {

	public static void main(String args[]) {

		
		Maths.sum(10, 20);
		Maths.sub(30, 10);

		Another.divide();							
	}			
}
*/

/*
class Maths {

	void sum(int firstNo, int secondNo) {

		System.out.println(firstNo + secondNo);
	}

	void sub(int firstNo, int secondNo) {

		System.out.println(firstNo - secondNo);
	}	
}

class Main {

	public static void main(String args[]) {

		Maths m1 = new Maths();

		m1.sum(10, 20);
		m1.sub(30, 10);							
	}			
}
*/


/*
class Maths {

	int firstNo;
	int secondNo;

	void sum() {

		System.out.println( firstNo + secondNo );
	}

	void sub() {

		System.out.println( firstNo - secondNo );
	}

}

class Main {

	public static void main(String args[]) {

		Maths m1 = new Maths();

		m1.firstNo = 10;
		m1.secondNo = 20;

		m1.sum();      m1.sub();
							
	}			
}
*/


/*
class Human {

	int iq = 4;

	void study() {

		iq++;
	}
	
	void interview() {

		if( iq > 10 ) {
			
			System.out.println("Selected");
		}
		else {

			System.out.println("Rejected");
		}
	}

	void greeting() {

		System.out.println("Hello");
	}	
}



class Main {

	public static void main(String args[]) {

		Human jonathan = new Human();
		Human manit = new Human();

		jonathan.study();
		manit.study();
		jonathan.study();
		jonathan.study();
		manit.study();
		manit.study();
		jonathan.study();
		jonathan.study();
		jonathan.study();
		manit.study();
		jonathan.study();
		jonathan.study();
		jonathan.study();
	
		manit.interview();
		jonathan.interview();

		manit.greeting();
		jonathan.greeting();
							
	}			
}

*/


/*class Human {

	int iq = 4;
	int altitude = 0; 
	
	void study() {

		iq++;
	}

	//void fly() {

	//	altitude = 10000;
	//}
	

	void boardPlane() {

		AirPlane boeing = new AirPlane();

		altitude = boeing.takeoff();
	}

}

class Airplane {

	int altitude = 0;

	int takeoff() {

		return 10000;
	}

}

class Main {

	public static void main(String args[]) {

		Human manit = new Human();

		manit.study();
		manit.fly();

							
	}			
}
*/


/*class Human {

	int iq = 4;
	int mascularStrength = 10;
	int height = 1;

	public void study() {

		iq++;
	}

	public void playingBasketBall() {

		height++;
	}

	public void gyming() {

		mascularStrength++;
	}
}



class Main {

	public static void main(String args[]) {

		Human celia = new Human();
		Human xi = new Human();

		System.out.println(celia.iq);
		System.out.println(celia.height);
		System.out.println(celia.mascularStrength);

		System.out.println(xi.iq);
		System.out.println(xi.height);
		System.out.println(xi.mascularStrength);

		celia.study();         celia.playingBasketBall();
		xi.study();     xi.study();     xi.study();
								

		System.out.println("After methods called");

		System.out.println(celia.iq);
		System.out.println(celia.height);
		System.out.println(celia.mascularStrength);

		System.out.println(xi.iq);
		System.out.println(xi.height);
		System.out.println(xi.mascularStrength);					
	}			
}
*/



/*class A {

	static int i = 4;

}

class B {

	static int i = 5;

}



class Main {

	static int i = 6;


	public static void main(String args[]) {

		System.out.println(Main.i);//Always make this habit to call static member/s with class Name
		System.out.println(A.i);
		System.out.println(B.i);
											
	}			
}
*/


/*class A {

	int i = 4;

}

class Main {

	public static void main(String args[]) {

		A a1 = new A();

		System.out.println(a1.i);

											
	}			
}*/



/*
class A {

	int i = 4;
	static int k = 5;

	public static void main(String args[]) {

		A a1 = new A();

		a1.print();								
	}

	void print() {//you can access non-static as well as static member from the non-static context/method...

		System.out.println(i);
		System.out.println(k);
 	
 	}		
}
*/


/*class A {

	int i = 4;
	static int k = 5;

	public static void main(String args[]) {

		A a1 = new A();

		print();								
	}

	static void print() {

		System.out.println(i);	//THis is illegal since you can not access non-static variable from the static method 	
 	}		
}
*/


/*
class A {

	public static void main(String args[]) {

		print();								
	}

	static void print() {

		System.out.println("Hi");		
 	}		
}
*/

/*class A {

	int i = 4;
	int j = 5;
	static int k; 

	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();

		System.out.println(a1.i);
		System.out.println(a1.j);

		System.out.println(a2.i);
		System.out.println(a2.j);


		System.out.println(k);									
	}			
}
*/


/*
class A {

	int i = 4;
	int j = 5;
	static int k;//This is static variable or class varibale which will have just 1 copy across class and shared among objects...
			//only variables declared outside the methods can be associtaed with static keyword but local varibales
			//can not be static variable 

	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();

		a1.add();
		a2.add();

										
	}

	void add() {

		k = i + j + k;
	}		
}
*/

/*
class A {

	int i = 4;
	int j = 5;
	int k;	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();

		a2.add(a1);

		System.out.println(a1.k);
		System.out.println(a2.k);
								
	}

	void add(A a) {

		a.k = i + a.j;
	}	
}*/



/*
class A {

	int i = 4;
	int j = 5;
	int k;	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();
		
		a1.add(a2);

		System.out.println(a1.k);
		System.out.println(a2.k);
		
									
	}

	void add(A a) {

		k = i + a.j;
	}	
}
*/

/*
class A {

	int i = 4;
	int j = 5;
	int k;	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();
		
		a1.add(a2.i);
		System.out.println(a1.k);
		System.out.println(a2.k);
									
	}

	void add(int value) {

		k = value + j;
	}	
}
*/


/*class A {

	int i = 4;
	int j = 5;
	int k;	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();
		a1.add();
		a2.add();

		System.out.println("the k of a1 is "+a1.k);
		System.out.println("the k of a2 is "+a2.k);					
	}

	void add() {

		k = i + j;	
	}	
}*/



/*class A {

	int i = 4;
	int j = 5;
	int k;//k will be assigned 0 as a default value since it is of int type(byte, short, int, long are given 0 as default value)
		//and those variables with no-value should be outside the methods but local variables should not be left with no value
		//while decalartion/creation of variable 
	
	public static void main(String args[]) {

		A a1 = new A();

		System.out.println("Value of k is before add() "+a1.k);

		a1.add();

		System.out.println("the k is after add() "+a1.k);
						
	}

	void add() {

		k = i +j;	
	}	
}*/





/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
						
		int localVariable = 10;	

		int returnedValue = a1.add(localVariable);	

		System.out.println("The returned Value is "+returnedValue);
	}

	int add(int local) {

		local = local * i + i - local;

		return local;	
	}	
}*/



/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
						
		int localVariable = 10;	

		a1.add(localVariable);	
	}

	void add(int local) {

		local = local * i + i - local;

		System.out.println(local);

		
	}	
}*/



/*
class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
						
		int localVariable = 10;	

		a1.add(localVariable);	
	}

	void add(int local) {

		System.out.println("localVariable passed to add() is "+local);

		
	}	
}
*/


/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
						
		int returnedValue = a1.add();    
		

		System.out.println("this is from mian() "+a1.i);
		System.out.println("Returned Value is "+returnedValue);
		
	}

	int add() {

		int i = 10;
		
		i = this.i * i + i - this.i;

		this.i = i + this.i * i;

		return i;//return must be the last statement

	}	
}*/





/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
						
		int returnedValue = a1.add();    
		

		System.out.println("this is from mian() "+a1.i);
		System.out.println("Returned Value is "+returnedValue);
		
	}

	int add() {

		int i = 10;
		
		i = this.i * i + i - this.i;

		return i;//return must be the last statement

	}	
}*/




/*
class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
						
		a1.add();    
		

		System.out.println("this is from mian() "+a1.i);
		
	}

	void add() {

		int i = 10;
		
		i = this.i * i + i - this.i;

		System.out.println("This is from the add() "+i);
	}	
}
*/


/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();
				
		a1.add();    
		a2.add();

		System.out.println(a1.i);
		System.out.println(a2.i);
	}

	void add() {

		i = 20;
	}	
}*/



/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();
		
		a1.add();    
		a2.add();
	}

	void add() {

		int j = 5;

		System.out.println(i+j);
	}	
}
*/



/*
class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
		
		a1.add();
	}

	void add() {

		int i = 5;	

		System.out.println(this.i);//it prints 4 since "this" keyword means the current object...
	}	
}*/




/*
class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
		
		a1.add();
	}

	void add() {

		int i = 5;	

		System.out.println(i);//it will print 5 since local variables are given prefernce if local variable and instance varibale of 						//same name 
	}	
}*/



/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();

		a2.i = 10;

		a1.add();	
		a2.add();
	}

	void add() {

		System.out.println("before update "+i);

		i = 20;		

		System.out.println("after update "+i);

	}	
}*/



/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();

		a1.add();	
		a2.add();
	}

	void add() {

		System.out.println(i);

	}	
}*/




/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a = new A();

		a.add();	
	}

	void add() {

		System.out.println(i);

	}	
}
*/



/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a = new A();

		a.add();

		System.out.println(a.i);	
	}

	void add() {

		System.out.println("inside add()");

	}	
}*/



/*class A {
	
	public static void main(String args[]) {

		A a = new A();

		a.add();	

		System.out.println("after add() call");	
	}

	void add() {

		System.out.println("inside add()");

	}	
}*/



/*class A {

	int i = 4;	
	int j = 5;
	
	public static void main(String args[]) {

		int k = 6;//local varibles are never be part of an object....

		A a1 = new A();
		

		System.out.println(a1.i);
		System.out.println(a1.j);

		System.out.println(k);
		
	}
}*/




/*class A {

	int i = 4;	
	int j = 5;
	
	public static void main(String args[]) {

		A a1 = new A();
		A a2 = new A();

		System.out.println(a1.i);
		System.out.println(a1.j);

		System.out.println(a2.i);
		System.out.println(a2.j);

	}
}*/



/*class A {

	int i = 4;//variable "i and j" are instance variables since they are part of an instance...
	int j = 5;
	
	public static void main(String args[]) {

		A a = new A();

		System.out.println(a.i);
		System.out.println(a.j);
	}

}*/



/*class A {

	int i = 4;
	
	public static void main(String args[]) {

		A a = new A();// variable "a" is a reference variable since it is holding the address of class A object

		System.out.println(a);

		System.out.println(a.i);
	}

}*/