import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingg {

	public static void main(String[] args) throws Exception {

		b();
		System.out.println("inside main()");

	}

	public static void b() throws Exception {

		c();
		System.out.println("inside b()");
	}

	public static void c() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File Name!!");

		String fileName = sc.next();

		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\" + fileName);
		FileReader reader = new FileReader(file);
		System.out.println((char) reader.read());

	}
}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//			b();
//			System.out.println("inside main()");
//		}
//		catch (Exception e) {
//			System.out.println("inside catch of main()");
//		}
//	}
//
//	public static void b() throws Exception {
//
//		
//			c();
//			System.out.println("inside b()");
//	}
//
//	public static void c() throws Exception {
//		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the File Name!!");
//
//			String fileName = sc.next();
//
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\" + fileName);
//			FileReader reader = new FileReader(file);
//			System.out.println((char) reader.read());
//		
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		b();
//		System.out.println("inside main()");
//	}
//
//	public static void b() {
//
//		try {
//			c();
//			System.out.println("inside b()");
//		}
//		catch (Exception e) {
//			System.out.println("inside catch of b()");
//		}
//	}
//
//	public static void c() throws Exception {
//		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the File Name!!");
//
//			String fileName = sc.next();
//
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\" + fileName);
//			FileReader reader = new FileReader(file);
//			System.out.println((char) reader.read());
//		
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		b();
//		System.out.println("inside main()");
//	}
//
//	public static void b() {
//
//		c();
//		System.out.println("inside b()");
//	}
//
//	public static void c() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the File Name!!");
//
//			String fileName = sc.next();
//
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\" + fileName);
//			FileReader reader = new FileReader(file);
//			System.out.println((char) reader.read());
//		}
//		catch (Exception e) {
//			System.out.println("inside catch of c()");
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) throws IOException {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the File Name!!");
//
//		String fileName = sc.next();
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\" + fileName);
//		FileReader reader = new FileReader(file);
//		System.out.println((char) reader.read());
//
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) throws IOException {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the File Name!!");
//
//		String fileName = sc.next();
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\" + fileName);
//		FileReader reader = new FileReader(file);
//		System.out.println((char) reader.read());
//
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the File Name!!");
//		
//		String fileName = sc.next();
//		
//		try {
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\"+fileName);
//			FileReader reader = new FileReader(file);
//			System.out.println((char)reader.read());
//		}
//		catch (Exception e) {
//			System.out.println("inside catch");
//			e.printStackTrace();
//			System.out.println("Enter the Correct File Name!!");
//			main(null);
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
////		int value = 553363;
////		String str = ""+value;
////		
////		System.out.println(str.length());
//		
//		String str = "565655e";
//		int value = 34143;
//		int parsedInt = Integer.parseInt(str);//This throws an exception since the string passed to parseInt()
//							//can not be converted into int...
//		
//		System.out.println(parsedInt+value);
//	}
//}

//import com.awesome.dao.UserDAO;
//import com.awesome.pojo.User;
//
//
//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
//		UserDAO userDAO = new UserDAO();
//		
//		User user = userDAO.findUser("102");
//		
//		if(user != null) {//null check
//			System.out.println(user.getName());
//		}
//		else {
//			System.out.println("User not Found...");
//		}
//	}
//}

//class Ab {
//
//	int i = 4;
//
//	void display() {
//
//		System.out.println("The value of i is " + i);
//	}
//}
//
//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
////		Ab a1 = new Ab();
////		
////		System.out.println(a1.i);
////		
////		a1.display();
//
//		Ab a1 = null;//you can assign reference variable to null but can not assign null to primitive 
//					//data type variable such as int, boolean, double...
//
//		System.out.println(a1.i);//this will lead to NullPointerException because I am trying to call
//							//variable on reference variable pointing to null or assigned to null...
//
//		a1.display();//this will lead to NullPointerException because I am trying to call
//		//method on reference variable pointing to null or assigned to null...
//	}
//}

//import java.util.Scanner;
//
//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the Divider!!");
//		int divider = sc.nextInt();
//
//		try {
//			
//			int value = 10/divider;
//			System.out.println("The value after division is "+value);		
//		} 
//		finally {
//			System.out.println("inside finally");
//		}	
//		
//		System.out.println("after finally");
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after division is "+value);
//				
//		} 
//		finally {//try without catch but with finally is legal...
//			
//			System.out.println("inside finally");
//			sc.close();
//		}
//		
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after division is "+value);
//				
//		} //just having try without either catch or finally is illegal. But you can have both finally and catch
//						//with try...
//		
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after division is "+value);
//				
//		} 
//		catch(Exception e) {
//			System.out.println("inside catch");
//		}
//		finally {//This finally block with always run whether you have exception raised in the try or not...
//			System.out.println("inside finally...");
//			sc.close();
//		}
//		
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			int i = 4/0;
//			
//			int[] salaries = {344, 34};
//			System.out.println(salaries[4]);
//			
//		} 
//		
//		catch(IndexOutOfBoundsException e) {
//			
//		}
//		catch (ArrayIndexOutOfBoundsException e) {//another example that the catch with the parent class
//								//can not come before the catch of Child class...
//			
//		}
//		
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			int i = 4/0;
//			
//			int[] salaries = {344, 34};
//			System.out.println(salaries[4]);
//			
//		} 
//		
//		
//		catch(Exception e) {
//			System.out.println("inside catch of Exception");
//			e.printStackTrace();
//		}
//		catch(ArithmeticException e) {//This is illegal since you can  not have catch block with the Parent
//										//before the catch of Child class...
//			System.out.println("inside catch of Arithmetic");
//			e.printStackTrace();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//			
//			String str = "Laurene";
//			System.out.println("Enter the index to fetch the character!!");
//			int stringIndex = sc.nextInt();
//			
//			System.out.println("The char of a string is "+str.charAt(stringIndex));
//			
//			
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("inside catch block of Arithmetic");
//			e.printStackTrace();
//		}
//		catch (IndexOutOfBoundsException e) {//This catch will handle both ArayIndex as well as StringIndex
//												//since IndexOutOfBounds is Parent Exception class of both.... 
//			System.out.println("inside catch block of IndexOutOfBounds");
//			e.printStackTrace();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//			
//			String str = "Laurene";
//			System.out.println("Enter the index to fetch the character!!");
//			int stringIndex = sc.nextInt();
//			
//			System.out.println("The char of a string is "+str.charAt(stringIndex));
//			
//			
//		} catch (Exception e) {
//			System.out.println("inside catch");
//			e.printStackTrace();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//			
//			String str = "Laurene";
//			System.out.println("Enter the index to fetch the character!!");
//			int stringIndex = sc.nextInt();
//			
//			System.out.println("The char of a string is "+str.charAt(stringIndex));
//			
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("inside catch block of ArrayIndex");
//			e.printStackTrace();
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch block of Arithmetic");
//			e.printStackTrace();
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside catch block of StringIndex");
//			e.printStackTrace();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("inside catch block of ArrayIndex");
//			e.printStackTrace();
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch block of Arithmetic");
//			e.printStackTrace();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		askDivider();
//		askIndex();
//		
//	}
//	public static void askDivider() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch of Arithmetic");
//			askDivider();
//		}
//	}
//	
//	public static void askIndex() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside catch of ArrayIndex");
//			askIndex();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		askDivider();
//		askIndex();
//		
//	}
//	public static void askDivider() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch of Arithmetic");
//			askDivider();
//		}
//	}
//	
//	public static void askIndex() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside catch of ArrayIndex");
//			askIndex();
//		}
//	}
//}

//public class ExceptionHandlingg {
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//			System.out.println("The value after divide is " + value);
//
//			int[] salaries = { 345, 769, 2312 };
//
//			System.out.println("Enter the index which you would like to access!!");
//			int index = sc.nextInt();
//
//			System.out.println("The accessed index value is " + salaries[index]);
//			
//		} catch (Exception e) {
//
//			System.out.println("inside catch block");
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		try {
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after divide is "+value);
//		}
//		catch (Exception e) {
//			
//			System.out.println("inside catch block");
//			e.printStackTrace();
//			System.out.println("Kinldy do not give 0 as divider!!!");
//			main(null);
//		}
//	}
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		try {
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after divide is "+value);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {//This catch will not be executed yet it is legal
//									//but is of no-use...
//			
//			System.out.println("inside catch block");
//			e.printStackTrace();
//			System.out.println("Kinldy do not give 0 as divider!!!");
//			main(null);
//		}
//	}
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		try {
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after divide is "+value);
//		}
//		catch (Exception e) {
//			
//			System.out.println("inside catch block");
//			e.printStackTrace();
//			System.out.println("Kinldy do not give 0 as divider!!!");
//			main(null);
//		}
//	}
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		try {
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			System.out.println("The value after divide is "+value);
//		}
//		catch (Exception e) {//catch will run only and only if there is problem/exception occurred in the
//							//try block...
//			System.out.println("inside catch block");
//			e.printStackTrace();
//		}
//	}
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			int i = 4/0;
//			
//			System.out.println("Hello");
//			
//			int[] salaries = { 34, 65, 7 };
//			
//			System.out.println(salaries[5]);
//		}
//		catch (Exception e) {
//			
//			System.out.println("inside catch...");
//			e.printStackTrace();
//		}
//	}
//
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		int[] salaries = { 43877, 56323, 56765, 32121 };
//		
//		System.out.println(salaries[4]);
//		
//		System.out.println("Hello");
//	}
//
//}

//public class ExceptionHandlingg {
//	
//	public static void main(String[] args) {
//		
//		int i = 4/0;
//		
//		System.out.println("Hello");
//	}
//
//}
