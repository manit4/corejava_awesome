
class A {
	
	int i = 4, j = 5, k = 6, l = 7, m = 8, n = 9, o = 10, p = 11;
	
	public String toString() {
		return "The value of i is "+i+", the vaue of j is "+j+", the vaue of k is "+k+", the vaue of l is "+l;
	}
}

public class Objectt  extends Object {
	
	public static void main(String[] args) {
		
		A a1 = new A();
	
		//System.out.println(a1.toString());
		System.out.println(a1);//when you write reference variable in the sysout then you do not
							//need to write toString() appended with the reference variable as I did
							// in the previous statement...
		
		
		Objectt obj = new Objectt();
		System.out.println(obj);
	}
}





//
//class A extends Object {
//	
//	int i = 4, j = 5, k;
//	
//	@Override
//	public boolean equals(Object obj) {
//		
//		A a = (A) obj;
//		
//		if(this.i == a.i) {
//			return true;
//		}
//		return false;
//	}
//}
//
//class B extends Object {
//	
//	int i = 4;
//	
//	public boolean equals(B b) {
//		
//		if(this.i == b.i) {
//			return true;
//		}
//		return false;
//	}
//}
//
//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		B b1 = new B();
//		B b2 = new B();
//		
//		boolean status = b1.equals(b2);
//		System.out.println(status);	
//	}
//}

//class A {
//	
//	int i = 4, j = 5, k;
//	
//  @override
//	public boolean equals(Object obj) {

//      A a = (A) obj
//		
//		if(this.i == a.i) {
//			return true;
//		}
//		return false;
//	}
//
//}
//

//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		A a1 = new A();
//		A a2 = new A();
//		
//		a1.i = 100;
//		
//		boolean status = a1.equals(a2);
//		System.out.println(status);
//		
//		
//	}
//
//}
