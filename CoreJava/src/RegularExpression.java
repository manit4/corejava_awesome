import java.util.Scanner;

public class RegularExpression {//email-id: manit_12@gmail.com

	public static void main(String[] args) {
		
		String str = "manit_12@gmail.com";
		
		System.out.println(str.matches("[\\w]+[@][a-z]+[\\.][a-z]{2,3}"));
	}
}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "8046545467";
//		
//		System.out.println(str.matches("[89][\\d]{9}"));
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "4546545467";
//		
//		//System.out.println(str.matches("[\\d][\\d][\\d][\\d][\\d][\\d][\\d][\\d][\\d][\\d]"));
//		
//		//System.out.println(str.matches("[\\d]+"));
//		
//		//System.out.println(str.matches("[\\d]{10}"));
//		
//		System.out.println(str.matches("[0-9]{10}"));
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = " ";
//		
//		System.out.println(str.matches("[\\W]"));//this upper case W is for "[^0-9a-zA-Z_]"
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "_";
//		
//		System.out.println(str.matches("[\\w]"));//this is for "[0-9a-zA-Z_]"
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "g";
//		
//		System.out.println(str.matches("[\\D]"));//internally it is like "[^0-9]"	
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "123";
//		
//		System.out.println(str.matches("[\\d][\\d][\\d]"));	
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "123456789";
//		
//		System.out.println(str.matches("[0-9]{5,8}"));	//{n,m} is the quantifier where n is the least 
//			//no of occurences and m is the most no of occurrences...
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "123";
//		
//		System.out.println(str.matches("[0-9]{5,}"));	//{n,} is the quantifier for n or more occurrences...
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "123655";
//		
//		System.out.println(str.matches("[0-9]{5}"));	//{n} is the quantifier n occurrences...
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "123";
//		
//		System.out.println(str.matches("[0-9]*"));	//* is the quantifier for 0 or more occurrences...
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "678";
//		
//		System.out.println(str.matches("[0-9]+"));	//+ is the quantifier for 1 or more occurrences...
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "6";
//		
//		System.out.println(str.matches("[0-9]?"));	//? is the quantifier of 0 or 1 occurrence...
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "6";
//		
//		System.out.println(str.matches("[A-Za-z0-9]"));	
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "V";
//		
//		System.out.println(str.matches("[A-Z]"));	
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "v";
//		
//		System.out.println(str.matches("[a-m]"));
//		
//		
//	}
//}

//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "v";
//		
//		System.out.println(str.matches("[^abcd]"));
//		
//		
//	}
//}


//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		String str = "a";
//		
//		System.out.println(str.matches("[abcd]"));
//		
//		
//	}
//}



//public class RegularExpression {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Name!!");
//		String name = sc.next();
//		
//		boolean validateName = name.matches("[A-Z][a-z]+");
//		
//		System.out.println(validateName);
//		
//		System.out.println("Enter your Phone No");
//		int phoneNo = sc.nextInt();
//		String castedPhone = ""+phoneNo;
//		
//		boolean validatePhone = castedPhone.matches("[0-9]{9}");
//		System.out.println(validatePhone);
//		
//	}
//}
