
public class Stringg {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Abc");
		
		String str = "Bcd";
		
		sb.append(str);
		
		System.out.println(sb);
		
		String str1 = "Abc";
		String str2 = "Bcd";
		
		str1.concat(str2);
		
		System.out.println(str1);
		
		
		
	}
}


//public class Stringg {
//
//	public static void main(String[] args) {
//
//		StringBuilder sb = new StringBuilder("Abc");
//		
//		String str = sb.substring(1);
//		
//		System.out.println(sb);
//		System.out.println(str);
//		
//	}
//}


//public class Stringg {
//
//	public static void main(String[] args) {
//
//		StringBuilder sb = new StringBuilder("Abc");
//		
//		sb.reverse();
//		
//		System.out.println(sb);
//		
//	}
//}




//public class Stringg {
//
//	public static void main(String[] args) {
//
//		String str1 = "Abc";
//		String str2 = "Bcd";
//		
//		System.out.println(str1.concat(str2));
//		
//	}
//}



//public class Stringg {
//
//	public static void main(String[] args) {
//
//		String str1 = "Abc";
//		String str2 = "Bcd";
//		
//		System.out.println(str1+str2);
//		
//		String str3 = "123";
//		String str4 = "456";
//		
//		System.out.println(str3+str4);
//		
//		int value = 11114554;
//		
//		System.out.println(value+str4);
//		
//		String str7 = ""+value;
//		System.out.println(str7.length());
//		
//	}
//}



//public class Stringg {
//
//	public static void main(String[] args) {
//
////		String str = "Manit";
////		System.out.println(str.replace('M', 'm'));
//		
//		
////		String str = "Manit, I am learning Java";
////		String[] strings = str.split("n");
////		
////		for(String value : strings) {
////			
////			System.out.println(value);
////		}
//		
//		String str = "Manit, I am learning Java";
//		String[] strings = str.split(" ");
//		
//		for(String value : strings) {
//			
//			System.out.println(value);
//		}
//		
//	}
//}




//public class Stringg {
//
//	public static void main(String[] args) {
//
////		String str1 = "Abc";
////		String str2 = "abc";
////		
////		System.out.println(str1 == str2);
////		System.out.println(str1.equals(str2));
////		
////		System.out.println(str1.equalsIgnoreCase(str2));
////		
////		System.out.println(str1.startsWith("b"));
////		System.out.println(str2.endsWith("bc"));
//		
////		System.out.println(str1.indexOf('b'));
////		
////		System.out.println(str1.charAt(2));
//		
//		String str = "Celia Lyu";
//		
//		String substr = str.substring(2);
//		System.out.println(substr);
//		
//		System.out.println(str.substring(1, 5));//Last index in substring method does not include the last index...
//	 
//	}
//}



//public class Stringg {
//
//	public static void main(String[] args) {
//
//		String str1 = "Abc";
//		String str2 = new String("Abc");
//		String str3 = "Abc";
//		String str4 = new String("Abc");
//		
//		System.out.println( str1 == str2 );
//		System.out.println( str2 == str3 );
//		System.out.println(str2 == str4 );
//		System.out.println( str1 == str3 );
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str4));
//		System.out.println(str3.equals(str1));
//		 
//	}
//}


//public class Stringg {
//
//	public static void main(String[] args) {
//
//		//String str = "Shuai";//Here I am creating String object with String literal but not with new keyword...
//
//		
////		String str1 = "Abc";
////		String str2 = "Bcd";
////		String str3 = "Abc";
////		
////		System.out.println(str1 == str2);
////		System.out.println(str1 == str3);
////		
////		str1.toLowerCase();
////		
////		System.out.println(str1 == str2);
////		System.out.println(str1 == str3);
//		
//		
////		
////		String str1 = "Abc";
////		String str2 = "Bcd";
////		String str3 = "Abc";
////		
////		System.out.println(str1 == str2);
////		System.out.println(str1 == str3);
////		
////		str1 = str1.toLowerCase();
////		
////		System.out.println(str1 == str2);
////		System.out.println(str1 == str3);
//		
//		 
//	}
//
//}





//public class Stringg {
//
//	public static void main(String[] args) {
//
////		char[] chars = { 'Z', 'h', 'e', 'n' };
////		
////		String str = new String(chars);
////		System.out.println(str);
//
//		char[] chars = { 'Z', 'h', 'e', 'n', 'L', 'u', 'o' };
//
//		String str = new String(chars, 1, 5);
//		System.out.println(str);
//
//	}
//
//}

//public class Stringg {
//	
//	public static void main(String[] args) {
//		
//		
////		String str = new String();//str is reference variable...
////		System.out.println(str.length());
////		System.out.println(str.isEmpty());
//		
//		String str = new String("Jingjing");
//		System.out.println(str.length());
//		System.out.println(str.isEmpty());
//		
//		System.out.println(str);//str is a reference variable yet you get the content printed in sysout
//							//and the reason is- since String class has also overridden the toString()
//							//of Object class...
//		
//		
//	}
//
//}
