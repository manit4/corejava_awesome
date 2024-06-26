
interface Maths {
	
	public String numberCheck(int number);
}

public class Lambdas {
	
	public static void main(String[] args) {
		
		Maths maths = num -> {
			
			String status = "Number is Odd";
			
			if( num % 2 == 0) {
				status = "Number is Even";
			}
			return status;
		};
		String status = maths.numberCheck(27);
		
		System.out.println("The Status is "+status);
				
		
	}
}



//interface Cab {
//	
//	public int book();
//}
//
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = () ->  100 ;
//		
//		int fair = cab.book();
//		System.out.println("The fair is "+fair);
//				
//		
//	}
//}



//interface Cab {
//	
//	public int book();
//}
//
//class Uber implements Cab {
//
//	@Override
//	public int book() {
//		
//		return 100;
//	}	
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		
//		int fair = cab.book();
//		System.out.println("The fair is "+fair);
//				
//		
//	}
//}




//interface Cab {
//	
//	public int book( String source, String destination );
//}
//
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = (pickup, drop) -> {
//			
//			System.out.println("Your Cab is booked from "+pickup+" to "+drop);
//			return 100;
//		};
//		
//		int fair = cab.book("Mumbai", "Delhi");
//		System.out.println("The fair is "+fair);
//		
//	}
//}



//interface Cab {
//	
//	public int book( String source, String destination );
//}
//
//class Uber implements Cab {
//
//	@Override
//	public int book(String source, String destination) {
//		
//		System.out.println("Your Cab is booked from "+source+ " to "+destination  );
//		
//		return 100;
//	}
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		int fair = cab.book("Nanjing", "shanghai");
//		System.out.println("The fair is "+fair);
//		
//	}
//}




//interface Cab {
//	
//	public void book( String source, String destination );
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = (source, destination) -> System.out.println("Your Cab is booked from "+source+ " to "+destination  );
//		cab.book("Huai'An", "Shanghai");
//				
//		
//	}
//}




//
//interface Cab {
//	
//	public void book( String source, String destination );
//}
//
//class Uber implements Cab {
//
//	@Override
//	public void book(String source, String destination) {
//		
//		System.out.println("Your Cab is booked from "+source+ " to "+destination  );
//		
//	}
//	
//	
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		cab.book("Huai'An", "Shanghai");
//				
//		
//	}
//}



//interface Cab {
//	
//	public void book();
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab uber = () -> System.out.println("Your Cab is booked and is on the way...");
//		uber.book();
//		
//	}
//}




//
//interface Cab {
//	
//	public void book();
//}
//
//class Uber implements Cab {
//
//	@Override
//	public void book() {
//		
//		System.out.println("Your Cab is booked and is on the way...");
//	}	
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab uber = new Uber();
//		uber.book();
//		
//	}
//}





//@FunctionalInterface
//interface Ac {//Functional interface is an interface which will have just 1 abstract method but can have
//				//static as well as default methods and this Functional interface was introduced in java 1.8
//	
//	void display();
//	//void print();
//	
//	static void add() {
//		
//	}
//	default void divide() {
//		
//	}
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		
//		
//	}
//}
