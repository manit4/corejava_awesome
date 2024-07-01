import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class InputOutput {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\AwesomeJavaBatch//xi.txt");
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		byte[] b = { 'w', 'e' };
		
		outputStream.write(b);
		
		outputStream.flush();//flush makes sure that all the characters are written without missing any character
		//so it is recommended to use on Output Streams...
		
		outputStream.close();//close is also recommended to use on input as well as on output streams...
	}
}



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
