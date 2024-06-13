import java.util.ArrayList;
import java.util.List;

public class Collectionn {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(4);
		list.add(32);
		list.add(56);
		list.add(1);

//		for (Integer i : list) {
//
//			System.out.println(i);
//		}
//		
//		System.out.println(list.contains(56));
//		
//		System.out.println("the index is "+list.indexOf(1));
//		
//		list.clear();
//		
//		System.out.println("The size is "+list.size());
		
		Object[] data = list.toArray();
		
		for(Object integer : data) {
			
			System.out.println(integer);
		}
		
		
	}
}



//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = new ArrayList<>();
//
//		list.add(4);
//		list.add(32);
//		list.add(56);
//		list.add(1);
//
//		list.remove(1);//here I am specifying the index
//		
//		Integer obj = 1;
//		
//		list.remove(obj);//here I mean Object "1" to be deleted form the Collection...
//		
//		for (Integer i : list) {
//
//			System.out.println(i);
//		}
//	}
//}


//public class Collectionn {// This Collection holds multiple types of data which is not
//	// good for the programming world...
//
//	public static void main(String[] args) {
//
//		List<Integer> list = new ArrayList<>();
//
//		list.add(4);
//		list.add(32);
//		list.add(2, 56);
//
//		list.set(1, 87);
//		
//		for (Integer i : list) {
//
//			System.out.println(i);
//		}
//	}
//}

//public class Collectionn {//This Collection holds multiple types of data which is not 
//						//good for the programming world...
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(4);
//		list.add(32);
//		list.add(2, 56);
//		
//		list.add(1, 87);
//		
//		//list.add(4, 12);//specifying the wrong index while adding element is illegal since you
//			//can insert element next to the last index occupied or you go to the index occupied...
//		
//		for(Integer i : list) {
//			
//			System.out.println(i);
//		}
//	}
//}

//class Ab {
//	
//	
//}
//
//public class Collectionn {//This Collection holds multiple types of data which is not 
//						//good for the programming world...
//	
//	public static void main(String[] args) {
//		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(4);
//		list.add(32);
//		//list.add("Laurene");this statement is illegal since I am trying to save String to Integer
//				//type Collection so other than Integer is not allowed....
//		
//		for(int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//		
//		for(Integer i : list) {
//			
//			System.out.println(i);
//		}
//	}
//}

//class Ab {
//	
//	
//}
//
//public class Collectionn {//This Collection holds multiple types of data which is not 
//						//good for the programming world...
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		Ab a1 = new Ab();
//		
//		list.add(4);
//		list.add(32);
//		
//		list.add("Eileen");
//		list.add(true);
//		list.add(a1);
//				
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));	
//		
//		System.out.println("iterating through for loop");
//		
//		for(int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//	}
//}

//public class Collectionn {
//	
//	public static void main(String[] args) {
//		
//		//int i = 4;
//		
////		Integer i = new Integer(4);
////		Integer j = new Integer("4");
//		
////		Integer i = 4;
////		Integer j = 4;
////		
////		System.out.println(i == j);
////		
////		
////		i++;
////		
////		System.out.println(i);
//		
////		int i = 4;
////		Integer obj1 = i;
////		Integer obj2 = 4;
////		
////		System.out.println(obj1 == obj2);
////		System.out.println(i == obj1);
//		
//		
//		
//		int i = 4;
//		Integer obj1 = i;
//		
//		int unboxed = obj1.intValue();
//		System.out.println(unboxed);
//		
//		
//	}
//
//}
