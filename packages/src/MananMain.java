import java.util.Scanner;

public class MananMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		count(str);
	}

	public static void count(String input) {
		 
		int upper = 0, lower = 0, number = 0, special = 0;
	    for (int i = 0; i < input.length(); i++)
	    {
	        if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
	            upper++;
	        else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
	            lower++;
	    }
	   
	    if(upper > lower) {
	    	System.out.println(input.toUpperCase());
	    }
	    else {
	    	System.out.println(input.toLowerCase());
	    }
	}
}




//public class MananMain {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int inputRows = sc.nextInt();
//				
//		
//		displayPattern(inputRows);
//	}
//
//	public static void displayPattern(int rows) {
//		 
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//	}
//}
