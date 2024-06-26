class Stadium {//This is singleton class and is achieved when there is no more than 1 thread....
	
	private static Stadium obj;
	
	private Stadium() {
		System.out.println("Stadium is created....."+Thread.currentThread().getName());
	}
	
	synchronized public static Stadium getInstance() {
		System.out.println("before if "+Thread.currentThread().getName());
		if( obj == null ) {
			System.out.println("inside if "+Thread.currentThread().getName());
			obj = new Stadium();
			System.out.println("After obj assignment...");
		}
		
		return obj;
	}
}

class MyThreadd extends Thread {
	
	public void run() {
		
		Stadium stadium = Stadium.getInstance();
		System.out.println("From Eileen Thread "+stadium);
	}
}

public class SingletonDesign {
	
	public static void main(String[] args) {
		
			MyThreadd eileen = new MyThreadd();   eileen.setName("eileen");
			eileen.start();
			
			Stadium stadium = Stadium.getInstance();
			System.out.println("from main Thread "+stadium);
	}
}



//
//class Stadium {
//	
//	private static Stadium obj;
//	
//	private Stadium() {
//		System.out.println("Stadium is created.....");
//	}
//	
//	public static Stadium getInstance() {
//		
//		if( obj == null ) {
//			System.out.println("inside if check...");
//			obj = new Stadium();
//		}
//		
//		return obj;
//	}
//}
//
//public class SingletonDesign {
//	
//	public static void main(String[] args) {
//		
//			Stadium stadium1 = Stadium.getInstance();
//			Stadium stadium2 = Stadium.getInstance();
//			
//			System.out.println(stadium1);
//			System.out.println(stadium2);
//	}
//}




//class Stadium {//This is not Singleton class but I tried to make this as singleton...
//	
//	private static Stadium obj;
//	
//	private Stadium() {
//		System.out.println("Stadium is created.....");
//	}
//	
//	public static Stadium getInstance() {
//		
//		obj = new Stadium();
//		
//		return obj;
//	}
//}
//
//public class SingletonDesign {
//	
//	public static void main(String[] args) {
//		
//			Stadium stadium1 = Stadium.getInstance();
//			Stadium stadium2 = Stadium.getInstance();
//			
//			System.out.println(stadium1);
//			System.out.println(stadium2);
//	}
//}




//class Stadium {
//	
//	private static Stadium obj;
//	
//	private Stadium() {
//		
//	}
//	
//	public static Stadium getInstance() {
//		
//		return obj;
//	}
//}
//
//public class SingletonDesign {
//	
//	public static void main(String[] args) {
//		
//			Stadium stadium1 = Stadium.getInstance();
//			Stadium stadium2 = Stadium.getInstance();
//			
//			System.out.println(stadium1);//This statement will print "null" since the static variable 
//					//in Stadium class is not initialized with the object and is given by default value which is null
//			System.out.println(stadium2);//This statement will print "null"
//	}
//}



//class Stadium {/This is the example of Eager Loading since static variable "obj" is holding the object
				//of Stadium class after the classes are loaded. You may not utilize the eagerly loaded static variable(initialized in advance)
				//anywhere in the code so in most cases, eager loading is not recommended...
//	
//	private static Stadium obj = new Stadium();
//	
//	private Stadium() {
//		
//	}
//	
//	public static Stadium getInstance() {
//		
//		return obj;
//	}
//	
//}
//
//public class SingletonDesign {
//	
//	public static void main(String[] args) {
//		
//		Stadium stadium1 = Stadium.getInstance();
//		Stadium stadium2 = Stadium.getInstance();
//		
//		System.out.println(stadium1);
//		System.out.println(stadium2);	
//		
//	}
//}
