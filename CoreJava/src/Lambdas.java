import java.util.ArrayList;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


class Employee {
	
	private int empId;
	private String name;
	private int salary;
	private int workX;
	public Employee() {
		
	}
	public Employee(int empId, String name, int salary, int workX) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.workX = workX;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkX() {
		return workX;
	}
	public void setWorkX(int workX) {
		this.workX = workX;
	}
}

public class Lambdas {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(100, "Eileen", 2500, 3);

		Function<Employee, Integer> function = emp -> emp.getSalary() * 2;
		
		System.out.println(function.apply(employee));
		
	}
}

//public class Lambdas {//Function itself is another functional interface in which there is a method 
//		//called apply which accepts one argument of any the and returns you anything... 
//
//	public static void main(String[] args) {
//
//		Function<String, Integer> function = name -> name.length();
//		
//		System.out.println(function.apply("Eileen"));
//	}
//}

//public class Lambdas {
//
//	public static void main(String[] args) {
//
//		Predicate<Integer> evenNoCheck = num -> {
//
//			boolean status = false;
//			if (num % 2 == 0) {
//				status = true;
//			}
//			return status;
//		};
//
//		List<Integer> numbers = List.of(100, 214, 4545);
//		
//		for( Integer value : numbers ) {
//			
//			System.out.println(evenNoCheck.test(value));
//		}
//	}
//}

//public class Lambdas {//Predicate is another functional interface which has a method called test
//				//and test accepts anything but returns you boolean...
//
//	public static void main(String[] args) {
//		
//		Predicate<Integer> evenNoCheck = num -> {
//			
//			boolean status = false;
//			if(num % 2 == 0) {
//				status = true;
//			}
//			return status;
//		};
//		
//		System.out.println(evenNoCheck.test(12));
//	}
//}

//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		List<String> names = List.of("Eileen", "Xi", "Celia");
//		List<Integer> sizes = new ArrayList<>();
//		
//		Supplier<List<Integer>> supplier = () -> {
//			
//			for( String name : names ) {
//				
//				sizes.add(name.length());
//			}
//			return sizes;
//		};
//		
//		System.out.println(supplier.get());
//	}
//}

//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		String name = "Eileen";
//
//		Supplier<Integer> supplier = () -> {
//			
//			return name.length();
//		};
//		
//		System.out.println(supplier.get());
//
//	}
//}

//public class Lambdas {
//
//	public static void main(String[] args) {
//
//		Supplier<Integer> supplier = () -> {
//			
//			String name = "Eileen";//you can declare and initialize anything inside lambdas function/expression... 
//			
//			return name.length();
//		};
//		
//		System.out.println(supplier.get());
//
//	}
//}

//public class Lambdas {//Supplier is another functional interface and its method "get()" does not accept
//					//anything but returns anything...
//
//	public static void main(String[] args) {
//
//		Supplier<Integer> supplier = () -> 100;
//		
//		System.out.println(supplier.get());
//
//		
//	}
//}

//class Employee {
//
//	private int empId;
//	private String name;
//	private String salary;
//	private int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int empId, String name, String salary, int workX) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSalary() {
//		return salary;
//	}
//
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
//
//	public int getWorkX() {
//		return workX;
//	}
//
//	public void setWorkX(int workX) {
//		this.workX = workX;
//	}
//}
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//
//		Employee employee1 = new Employee(100, "Eileen", "10000", 6);
//		Employee employee2 = new Employee(101, "Zhen", "4000", 2);
//		Employee employee3 = new Employee(102, "Laurene", "6000", 7);
//		Employee employee4 = new Employee(103, "Celia", "5000", 4);
//
//		List<Employee> emps = List.of(employee1, employee2, employee3, employee4);
//		
//		Consumer<List<Employee>> consumer = employees -> {
//			
//			for(Employee employee : employees) {
//				
//				if(employee.getWorkX() >= 5) {
//					
//					int bonus = Integer.parseInt(employee.getSalary()) * 2;
//					System.out.println(employee.getName()+", your bonus is "+bonus);
//				}
//				else {
//					System.out.println(employee.getName()+", you are not eligibel for bonus");
//				}
//			}
//		};
//
//		consumer.accept(emps);
//	}
//}

//class Employee {
//
//	private int empId;
//	private String name;
//	private String salary;
//	private int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int empId, String name, String salary, int workX) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSalary() {
//		return salary;
//	}
//
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
//
//	public int getWorkX() {
//		return workX;
//	}
//
//	public void setWorkX(int workX) {
//		this.workX = workX;
//	}
//}
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//
//		Employee employee1 = new Employee(100, "Eileen", "10000", 6);
//		Employee employee2 = new Employee(101, "Zhen", "4000", 2);
//		Employee employee3 = new Employee(102, "Laurene", "6000", 7);
//		Employee employee4 = new Employee(103, "Celia", "5000", 4);
//
//		Consumer<Employee> consumer = emp -> {
//
//			if (emp.getWorkX() >= 5) {
//				int bonus = Integer.parseInt(emp.getSalary()) * 2;
//				System.out.println(emp.getName() + ", your bonus amount is " + bonus);
//			} else {
//				System.out.println(emp.getName() + ", you are not eligible for bonus");
//			}
//		};
//
////		List<Employee> employees = new ArrayList<>();
////		employees.add(employee1);   employees.add(employee2);  employees.add(employee3);  employees.add(employee4);
//		
//		List<Employee> employees = List.of(employee1, employee2, employee3, employee4);
//		
//		for( Employee employee : employees ) {
//			
//			consumer.accept(employee);
//		}
//	}
//}

//class Employee {
//
//	private int empId;
//	private String name;
//	private String salary;
//	private int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int empId, String name, String salary, int workX) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSalary() {
//		return salary;
//	}
//
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
//
//	public int getWorkX() {
//		return workX;
//	}
//
//	public void setWorkX(int workX) {
//		this.workX = workX;
//	}
//}
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//
//		Employee employee1 = new Employee(100, "Eileen", "10000", 6);
//		Employee employee2 = new Employee(101, "Zhen", "4000", 2);
//		Employee employee3 = new Employee(102, "Laurene", "6000", 7);
//		Employee employee4 = new Employee(103, "Celia", "5000", 4);
//
//		Consumer<Employee> consumer = emp -> {
//
//			if (emp.getWorkX() >= 5) {
//				int bonus = Integer.parseInt(emp.getSalary()) * 2;
//				System.out.println(emp.getName() + ", your bonus amount is " + bonus);
//			} else {
//				System.out.println(emp.getName() + ", you are not eligible for bonus");
//			}
//		};
//
//		List<Employee> employees = new ArrayList<>();
//		employees.add(employee1);   employees.add(employee2);  employees.add(employee3);  employees.add(employee4);
//		
//		for( Employee employee : employees ) {
//			
//			consumer.accept(employee);
//		}
//	}
//}

//class Employee {
//
//	private int empId;
//	private String name;
//	private String salary;
//	private int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int empId, String name, String salary, int workX) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSalary() {
//		return salary;
//	}
//
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
//
//	public int getWorkX() {
//		return workX;
//	}
//
//	public void setWorkX(int workX) {
//		this.workX = workX;
//	}
//}
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//
//		Employee employee1 = new Employee(100, "Eileen", "10000", 6);
//		Employee employee2 = new Employee(101, "Zhen", "4000", 2);
//		Employee employee3 = new Employee(102, "Laurene", "6000", 7);
//		Employee employee4 = new Employee(103, "Celia", "5000", 4);
//
//		Consumer<Employee> consumer = emp -> {
//
//			if (emp.getWorkX() >= 5) {
//				int bonus = Integer.parseInt(emp.getSalary()) * 2;
//				System.out.println(emp.getName() + ", your bonus amount is " + bonus);
//			} else {
//				System.out.println(emp.getName() + ", you are not eligible for bonus");
//			}
//		};
//
//		consumer.accept(employee1);    consumer.accept(employee2);   consumer.accept(employee3);
//		consumer.accept(employee4);
//	}
//}

//class Employee {
//	
//	private int empId;
//	private String name;
//	private String salary;
//	private int workX;
//	public Employee() {
//		
//	}
//	public Employee(int empId, String name, String salary, int workX) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getSalary() {
//		return salary;
//	}
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
//	public int getWorkX() {
//		return workX;
//	}
//	public void setWorkX(int workX) {
//		this.workX = workX;
//	}
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Employee employee = new Employee(100, "Eileen", "10000", 6);
//		
//		Consumer<Employee> consumer = emp -> {
//			
//			if(emp.getWorkX() >= 5) {
//				int bonus = Integer.parseInt(emp.getSalary())* 2;
//				System.out.println(emp.getName()+" your bonus amount is "+bonus);
//			}
//			else {
//				System.out.println(emp.getName()+" you are not eligible for salary");
//			}	
//		};
//		
//		consumer.accept(employee);
//	}
//}

//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Consumer<Integer> consumer1 = number -> System.out.println("The no passed is "+number);
//		
//		consumer1.accept(100);
//		
//		Consumer<Integer> consumer2 = number -> {
//			
//			if( number % 2 == 0 ) {
//				System.out.println("The Number passed is Even");
//			}
//			else {
//				System.out.println("The Number passed is Odd");
//			}
//		};
//		
//		consumer2.accept(234);
//		
//		Consumer<String> consumer3 = name -> System.out.println("The name is "+name+ " and length is "+name.length());
//		consumer3.accept("Jingjing");
//	}
//}

//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Consumer<String> consumer = str -> {
//			
//			System.out.println("The String passed is "+str);
//			System.out.println("And the length of the passed string is "+str.length());
//		};
//		
//		consumer.accept("Eileen");
//	}
//}

//interface Maths {
//	
//	public String numberCheck(int number);
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Maths maths = num -> {
//			
//			String status = "Number is Odd";
//			
//			if( num % 2 == 0) {
//				status = "Number is Even";
//			}
//			return status;
//		};
//		String status = maths.numberCheck(27);
//		
//		System.out.println("The Status is "+status);
//				
//		
//	}
//}

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
