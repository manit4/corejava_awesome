import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employeee implements Serializable {

	private transient String employeeId;
	private String employeeName;

	public Employeee() {

	}

	public Employeee(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}

public class InputOutput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//eileen.txt");

		FileInputStream reader = new FileInputStream(file);

		ObjectInputStream objectInputStream = new ObjectInputStream(reader);

		Employeee employeee = (Employeee) objectInputStream.readObject();

		System.out.println(employeee.getEmployeeId() + ", " + employeee.getEmployeeName());
	}
}

//class Employeee implements Serializable {
//
//	private transient String employeeId;
//	private String employeeName;
//
//	public Employeee() {
//
//	}
//
//	public Employeee(String employeeId, String employeeName) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//	}
//
//	public String getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//}
//
//public class InputOutput {
//
//	public static void main(String[] args) throws IOException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//eileen.txt");
//
//		FileOutputStream writer = new FileOutputStream(file);
//
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(writer);
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter your Employee Id");
//		int empId = sc.nextInt();
//
//		System.out.println("Enter your Employee Name");
//		String name = sc.next();
//
//		Employeee employeee = new Employeee("" + empId, name);
//
//		objectOutputStream.writeObject(employeee);
//
//		objectOutputStream.flush();
//	}
//}

//class Employeee implements Serializable {// Serializable is marker interface which means it does not have
//	// any method...
//
//	private String employeeId;
//	private String employeeName;
//
//	public Employeee() {
//
//	}
//
//	public Employeee(String employeeId, String employeeName) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//	}
//
//	public String getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//}
//
//public class InputOutput {
//
//	public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//eileen.txt");
//
//		FileInputStream reader = new FileInputStream(file);
//
//		ObjectInputStream objectInputStream = new ObjectInputStream(reader);
//		
//		Employeee employeee =  (Employeee) objectInputStream.readObject();
//		
//		System.out.println(employeee.getEmployeeId()+", "+employeee.getEmployeeName());
//	}
//}

//class Employeee implements Serializable {//Serializable is marker interface which means it does not have 
//					//any method...
//	
//	private String employeeId;
//	private String employeeName;
//	public Employeee() {
//		
//	}
//	public Employeee(String employeeId, String employeeName) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//	}
//	public String getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//}
//
//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//eileen.txt");
//		
//		FileOutputStream writer = new FileOutputStream(file);
//		
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(writer);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Employee Id");
//		int empId = sc.nextInt();
//		
//		System.out.println("Enter your Employee Name");
//		String name = sc.next();
//		
//		Employeee employeee = new Employeee(""+empId, name);
//		
//		objectOutputStream.writeObject(employeee);
//		
//		objectOutputStream.flush();	
//	}
//}

//class Employeee {
//	
//	private String employeeId;
//	private String employeeName;
//	public Employeee() {
//		
//	}
//	public Employeee(String employeeId, String employeeName) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//	}
//	public String getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//}
//
//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(reader);
//		
//		String data = bufferedReader.readLine();
//
//		System.out.println(data);
//		
//		String employeeId = data.substring(0, data.indexOf(" "));
//		String employeeName = data.substring(data.indexOf(" "));
//		
//		System.out.println("The Employee Id is "+employeeId+" and the name is "+employeeName);
//		
//		Employeee employeee = new Employeee(employeeId, employeeName); 
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileWriter writer = new FileWriter(file);
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(writer);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Employee Id");
//		int empId = sc.nextInt();
//		
//		System.out.println("Enter your Employee Name");
//		String name = sc.next();
//		
//		bufferedWriter.write(""+empId+" "+name);
//		bufferedWriter.flush();
//		bufferedWriter.close();
//		
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(reader);
//		
//		String line = null;
//		
//		while( (line = bufferedReader.readLine()) != null ) {
//			
//			System.out.println(line);
//		}
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileWriter writer = new FileWriter(file);
//		
//		writer.write("I am learning IO");
//		
//		writer.flush();//do not forget to call flush() on writer streams...
//		
//		writer.close();
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		 char[] data = new char[10];
//		 
//		 reader.read(data);
//		 
//		 for( char val : data ) {
//			 
//			 System.out.println(val);
//		 }
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileReader reader = new FileReader(file);//FileReader is char oriented stream.....
//		
//		System.out.println((char)reader.read());//this read() returns the ASCII value of char read which you
//						//can further cast it to the actual character... 
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileReader reader = new FileReader(file);//FileReader is char oriented stream.....
//		
//		System.out.println((char)reader.read());//this read() returns the ASCII value of char read which you
//						//can further cast it to the actual character... 
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileOutputStream outputStream = new FileOutputStream(file);
//		
//		byte[] b = { 'w', 'e' };
//		
//		outputStream.write(b);
//		
//		outputStream.flush();//flush makes sure that all the characters are written without missing any character
//		//so it is recommended to use on Output Streams...
//		
//		outputStream.close();//close is also recommended to use on input as well as on output streams...
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileOutputStream outputStream = new FileOutputStream(file);
//		
//		outputStream.write('M');//this write() accepts int as an argument however, I am providing char
//						//since char is internally int so you can provide direct character instead of its
//						//ASCII value...
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileInputStream stream = new FileInputStream(file);
//		
//		byte[] data = stream.readAllBytes();
//		
//		for( byte b : data ) {
//			
//			System.out.print((char)b);
//		}
//		stream.close();
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileInputStream stream = new FileInputStream(file);
//		
//		byte[] data = stream.readAllBytes();
//		
//		for( byte b : data ) {
//			
//			System.out.print((char)b);
//		}
//		stream.close();
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileInputStream stream = new FileInputStream(file);
//		
//		for( int i = 0; i < 4; i++ ) {
//			
//			System.out.print((char)stream.read());
//			System.out.println(stream.available());
//		}
//		stream.close();
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileInputStream stream = new FileInputStream(file);
//		
//		for( int i = 0; i < 4; i++ ) {
//			
//			System.out.print((char)stream.read());
//		}
//      stream.close();
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) throws IOException {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
//		
//		FileInputStream stream = new FileInputStream(file);
//		
//		int data = stream.read();//here read() returns 1 char at a time and it returns int representaion
//					//or ASCII value of that character read...
//		
//		System.out.println((char)data);//here, I am simply converting ASCII value(which is int) into the actual character...
//		
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch");
//		
//		String[] names = file.list();
//		
//		for( String name : names ) {
//			
//			System.out.println(name);
//			
//			String path = "C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//"+name;
//			
//			File file2 = new File(path);
//			System.out.println(file2.isFile());
//		}	
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch");
//		
//		String[] names = file.list();
//		
//		for( String name : names ) {
//			
//			System.out.println(name);
//			
//			String path = "C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//"+name;
//			
//			File file2 = new File(path);
//			System.out.println(file2.isFile());
//		}	
//	}
//}

//public class InputOutput {
//	
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\checking");
//		
//		System.out.println(file.isAbsolute());
//		
//		System.out.println(file.canExecute());
//		
//		System.out.println(file.mkdir());
//		
//	}
//}

//
//public class InputOutput {
//	
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\b.txt");
//		
//		//System.out.println(file.canRead());
//		
//		File file2 = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\xi.txt");
//		
//		file.renameTo(file2);
//		
//	}
//}

//
//public class InputOutput {
//	
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\a.txt");
//		
//		System.out.println(file);
//		System.out.println(file.length());
//		System.out.println(file.lastModified());
//		
//		System.out.println(file.getName());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		
//		File file2 = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch\\ab.txt");
//		System.out.println(file2.exists());
//		
//	}
//
//}

//we have 2 types of streams, one is byte-oriented and another one is char-oriented... 

//public class InputOutput {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Name");
//		String name = sc.next();
//		
//		System.out.println("The name entered is "+name);
//	}
//
//}
