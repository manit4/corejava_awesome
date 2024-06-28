import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{

	private int empId;
	private String name;
	private String salary;
	private int workX;

	public Employee() {

	}

	public Employee(int empId, String name, String salary, int workX) {
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getWorkX() {
		return workX;
	}

	public void setWorkX(int workX) {
		this.workX = workX;
	}

	@Override
	public int compareTo(Employee o) {
		
		int status = 0;
		if(this.workX < o.workX) 
			status = -1;
		else if( this.workX > o.workX )
			status = 1;
		return status;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", workX=" + workX + "]";
	}
	
	
}

public class Streams {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(100, "Eileen", "10000", 10);
		Employee employee2 = new Employee(101, "Xi", "12000", 15);
		Employee employee3 = new Employee(102, "Zhen", "9000", 7);
		Employee employee4 = new Employee(103, "Shuai", "15000", 14);
		
		List<Employee> employees = List.of(employee1, employee2, employee3, employee4);
		
		employees.stream().sorted().forEach(emp -> System.out.println(emp));
		
	}
}



//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(23, 45, 23, 121, 76);
//		
//		list.stream().sorted().forEach(System.out::println);
//		
//		System.out.println("After implementing Comparator in sorted()....");
//		
//		list.stream().sorted((val1, val2) -> {
//			int status = 0;
//			if( val1 < val2 )
//				status = 1;
//			else if( val1 > val2 )
//				return -1;
//			return status;
//		}).forEach(System.out::println);
//	}
//}



//list.stream()
//.sorted((val1, val2) ->  {
//	int status = 0;
//	if(val1 < val2) {
//		status = 1;
//	}
//	else if(val1 > val2) {
//		status = -1;
//	}
//	return status;
//}).forEach(System.out::println);


//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(23, 45, 23, 121, 76);
//		
//		list.stream().skip(2).forEach(System.out::println);
//	
//	}
//}


//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(23, 45, 23, 121, 76);
//		
//		list
//			.stream()
//				.filter(val -> val % 2 != 0)
//					.map(val2 -> val2 * 2)
//						.filter(val3 -> val3 < 100)
//							.forEach(System.out::println);
//	
//	}
//}



//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(23, 45, 23, 121, 76);
//		
//		list.stream().filter(val -> val % 2 != 0).map(val2 -> val2 * 2).forEach(System.out::println);
//	
//	}
//}




//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(23, 45, 23, 121, 76);
//		
//		list.stream().distinct().forEach(System.out::println);
//		
//		System.out.println("Below are the limit elements...");
//		
//		list.stream().limit(3).forEach(System.out::println);
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
//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		Employee employee1 = new Employee(100, "Eileen", "10000", 10);
//		Employee employee2 = new Employee(101, "Xi", "12000", 15);
//		Employee employee3 = new Employee(102, "Zhen", "9000", 7);
//		Employee employee4 = new Employee(103, "Shuai", "15000", 14);
//		
//		List<Employee> employees = List.of(employee1, employee2, employee3, employee4);
//		
//		employees
//			.stream()
//				.filter(emp -> emp.getWorkX() >= 10)
//					.forEach(val -> System.out.println(val.getName()+", you are eligible for bonus"));
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
//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		Employee employee1 = new Employee(100, "Eileen", "10000", 10);
//		Employee employee2 = new Employee(101, "Xi", "12000", 15);
//		Employee employee3 = new Employee(102, "Zhen", "9000", 7);
//		Employee employee4 = new Employee(103, "Shuai", "15000", 14);
//		
//		List<Employee> employees = List.of(employee1, employee2, employee3, employee4);
//		
//		employees.stream().map(emp -> emp.getName()+", your bonus amount is "+Integer.parseInt(emp.getSalary()) * 2).forEach(val -> System.out.println(val));	
//	}
//}




//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(12, 43, 15, 56);
//		
//		list.stream().map(val -> val * 2).forEach(System.out::println);	
//		
//		List<Integer> newList = list.stream().map(val -> val * 2).collect(Collectors.toList());
//		
//		newList.forEach(System.out::println);
//	}
//}



//public class Streams {//in Streams, you will not see the original collection effected....
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(12, 43, 15, 56);
//		
//		list.stream().filter(number -> number % 2 == 0).forEach(val -> System.out.println(val));	
//	}
//}



//public class Streams {//in Streams, you will not see the original collection effected....
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(12, 43, 15, 56);
//		
//		List<Integer> newList =  list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
//		
//		for( Integer val : newList ) {
//			System.out.println(val);
//		}
//		
//		System.out.println("Below is the original list");
//		
//		for( Integer val : list ) {//in Streams, you will not see the original collection effected....
//			System.out.println(val);
//		}
//		
//		System.out.println("Below is the new way of printing through ForEach...");
//		
//		list.forEach(val -> System.out.println(val));
//	}
//}



//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = List.of(12, 43, 15, 56);
//		
//		for(Integer value : list) {
//			
//			if( value % 2 != 0 ) {
//				
//				System.out.println(value);
//			}
//		}
//		
//		//list.stream().filter(val -> val % 2 != 0).forEach(number -> System.out.println(number));
//		
////		for( Integer val : list ) {
////			
////			System.out.println(val + 5);
////		}
//		
//		//list.stream().map(val -> val + 5).forEach(number -> System.out.println(number));
//	}
//}
