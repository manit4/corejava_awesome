package com.awesome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Restaurant {// This is the example of lazy-loading, it means, if you are not using object in
					// the
	// program, it does not create in advance. It creates only and only if
	// there is need in the program or somebody ask for it to the IOC container...

	public Restaurant() {
		System.out.println("no-arg constr....");
	}
}

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
		
		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
	}
}

//class Restaurant {//This is the example of lazy-loading, it means, if you are not using object in the 
//					//program, it does not create in advance. It creates only and only if 
//					//there is need in the program or somebody ask for it to the IOC container...
//					//Since, by default, nature is eager-loading but I have set the bean definition
//					//in the .xml file with "lazy-init=true" which makes it to lazy loading...
//
//	public Restaurant() {
//		System.out.println("no-arg constr....");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//		System.out.println("inside main()");
//	}
//}

//class Restaurant {//This example is for eager-loading which means, whether you use object/bean in your 
//				//project, it will surely create the object/bean in advance. By default, the nature of
//				//loading is eager... 
//
//	public Restaurant() {
//		System.out.println("no-arg constr....");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//
//	}
//}

//class Restaurant {//Here is the example of bean scope in spring. By default, the bean scope in spring is Singleton
//		//which means, you will have single object created and returned whenever you ask for it... 
//		//However, we can set the bean scope to prototype in bean definition in .xml file which means,
// it will return you the new object whenever you ask for it....
//	String name;
//	
//	public Restaurant() {
//		System.out.println("no-arg constr....");
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//
//		Restaurant restaurant1 = context.getBean("restaurantBean", Restaurant.class);
//		System.out.println(restaurant1);
//		
//		Restaurant restaurant2 = context.getBean("restaurantBean", Restaurant.class);
//		System.out.println(restaurant2);
//	}
//}

//class Tea {
//	
//	String name;
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void prepareTea() {
//
//		System.out.println(name+" is being prepared...");
//	}
//}
//
//class Restaurant {
//
//	Tea tea;
//
//	public Restaurant(Tea tea) {
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//
//		tea.prepareTea();
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//
//		restaurant.placeOrder();
//	}
//}

//class Tea {
//
//	public Tea() {
//		System.out.println("inside no-arg Tea constr...");
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared...");
//	}
//}
//
//class Restaurant {
//
//	Tea tea;
//
//	public Restaurant(Tea tea) {
//		System.out.println("inside parameterised Restaurant constr...");
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//
//		tea.prepareTea();
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//
//		restaurant.placeOrder();
//	}
//}

//class Tea {
//
//	public Tea() {
//		System.out.println("inside no-arg Tea constr...");
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared...");
//	}
//}
//
//class Restaurant {
//
//	Tea tea;
//
//	public Restaurant() {
//		System.out.println("inside no-arg Restaurant constr...");
//	}
//
//	public void setTea(Tea tea) {
//		System.out.println("inside setter() setTea");
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//
//		tea.prepareTea();
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//
//		restaurant.placeOrder();
//
//	}
//
//}

//class Restaurant {
//	
//	String name;
//
//	public Restaurant(String name) {
//		this.name = name;
//	}
//	
//	public void placeOrder() {
//		
//		System.out.println("Order placed...");
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant = new Restaurant("Jing");
//		System.out.println(restaurant.name);
//	}
//}

//class Restaurant {
//	
//	String name;
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void placeOrder() {
//		
//		System.out.println("Order placed...");
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant = new Restaurant();
//		System.out.println(restaurant.name);
//		
//		restaurant.setName("Jing");
//		System.out.println(restaurant.name);
//	}
//}

//class Tea {
//	
//	public Tea() {
//		System.out.println("inside no-arg Tea constr...");
//	}
//	
//	public void prepareTea() {
//		
//		System.out.println("Tea is being prepared...");
//	}
//}
//
//class Restaurant {
//	
//	Tea tea;
//	
//	public Restaurant() {
//		System.out.println("inside no-arg Restaurant constr...");
//	}
//
//	public void setTea(Tea tea) {
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//		
//		tea.prepareTea();
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.placeOrder();
//		
//	}
//
//}

//class Tea {
//	
//	public void prepareTea() {
//		
//		System.out.println("Tea is being prepared...");
//	}
//}
//
//class Restaurant {
//	
//	Tea tea = new Tea();
//	
//	public void placeOrder() {
//		
//		tea.prepareTea();
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant = new Restaurant();
//		
//		restaurant.placeOrder();
//		
//		
//		
//	}
//
//}

//ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//
//Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);

//class Restaurant {
//	
//	String restName;
//	
//	public Restaurant(String restName) {
//		System.out.println("inside para constr....");
//		this.restName = restName;
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared..."+restName);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//		
//	}
//
//}

//class Restaurant {
//	
//	String restName;
//	
//	public Restaurant() {
//		System.out.println("no-arg");
//	}
//	
//	public void setRestName(String restName) {
//		System.out.println("inside setter");
//		this.restName = restName;
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared..."+restName);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//		
//	}
//
//}

//class Restaurant {
//	
//	String restName;
//	
//	public Restaurant() {
//		System.out.println("no-arg");
//	}
//	
//	public void setRestName(String restName) {
//		this.restName = restName;
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared..."+restName);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant =  new Restaurant();    System.out.println(restaurant.restName);
//		
//		restaurant.setRestName("Jing Chains");
//		System.out.println(restaurant.restName);
//		
//	}
//
//}

//class Restaurant {
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared...");
//	}
//	
//	public Restaurant() {
//		System.out.println("inside Restaurant constructor...");
//	}
//
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("com\\awesome\\beans.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//		
//	}
//
//}

//class Restaurant {
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared...");
//	}
//}
//
//class AdvanceRestaurant extends Restaurant {
//
//	public void prepareTea() {
//
//		System.out.println("Special Tea is being prepared...");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant = new AdvanceRestaurant();
//
//		restaurant.prepareTea();
//	}
//
//}

//class Restaurant {
//
//	public void prepareTea() {
//
//		System.out.println("Tea is being prepared...");
//	}
//
//	public Restaurant(String str) {
//
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant = new Restaurant();
//
//		restaurant.prepareTea();
//	}
//
//}
