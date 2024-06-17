import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionn {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Steven");
		list.add("Shuai");
		list.add("Eileen");

		for (String value : list) {

			System.out.println(value);
		}

		System.out.println("After sort");

		Collections.sort(list);//Collection is a framework in which Collection is an interface and 
						//Collections is a utility class in which we have utility method like sort()...

		for (String value : list) {

			System.out.println(value);
		}

	}
}

//class Iphone implements Comparable<Iphone>{
//	
//	int price;
//	int manufacturingYear;
//	int version;
//	
//	public Iphone(int price, int manufacturingYear, int version) {
//		super();
//		this.price = price;
//		this.manufacturingYear = manufacturingYear;
//		this.version = version;
//	}
//
//	@Override
//	public int compareTo(Iphone o) {
//		System.out.println("inside compareTo()");
//		
//		int status = 0;
//		
//		if( this.price < o.price ) {
//			status = -1;
//		}
//		else if( this.price > o.price ) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//
//class ManuFacturingYearSort implements Comparator<Iphone> {
//
//	@Override
//	public int compare(Iphone o1, Iphone o2) {
//		
//		int status = 0;
//		
//		if(o1.manufacturingYear < o2.manufacturingYear) {
//			status = -1;
//		}
//		else if( o1.manufacturingYear > o2.manufacturingYear ) {
//			status = 1;
//		}
//		return status;
//	}	
//}
//
//class VersionSort implements Comparator<Iphone> {
//
//	@Override
//	public int compare(Iphone o1, Iphone o2) {
//
//		int status = 0;
//		
//		if( o1.version < o2.version ) {
//			status = -1;
//		}
//		else if( o1.version > o2.version ) {
//			status = 1;
//		}
//		
//		return status;
//	}
//	
//	
//}
//
//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<Iphone> set = new TreeSet<>(new ManuFacturingYearSort());
//
//		Iphone i1 = new Iphone(1000, 2022, 12);
//		Iphone i2 = new Iphone(1200, 2021, 13);
//		Iphone i3 = new Iphone(1400, 2023, 14);
//
//		set.add(i2);  set.add(i3);   set.add(i1);
//		
//		for( Iphone value : set ) {
//			
//			System.out.println(value.price+", "+value.manufacturingYear+", "+value.version);
//		}
//		
//		
//		Set<Iphone> set2 = new TreeSet<>(new VersionSort());
//
//		Iphone i11 = new Iphone(1000, 2022, 12);
//		Iphone i22 = new Iphone(1200, 2021, 13);
//		Iphone i33 = new Iphone(1400, 2023, 11);
//
//		set2.add(i22);  set2.add(i33);   set2.add(i11);
//		
//		System.out.println("Below are the elements sorted on Version...");
//		
//		for( Iphone value : set2 ) {
//			
//			System.out.println(value.price+", "+value.manufacturingYear+", "+value.version);
//		}
//		
//	}
//}

//class Iphone {
//	
//	int price;
//	int manufacturingYear;
//	int version;
//	
//	public Iphone(int price, int manufacturingYear, int version) {
//		super();
//		this.price = price;
//		this.manufacturingYear = manufacturingYear;
//		this.version = version;
//	}
//}
//
//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<Iphone> set = new LinkedHashSet<>();
//
//		Iphone i1 = new Iphone(1000, 2021, 12);
//		Iphone i2 = new Iphone(1200, 2022, 13);
//		Iphone i3 = new Iphone(1400, 2023, 14);
//
//		set.add(i1);  set.add(i2);  set.add(i3);
//		
//		for( Iphone value : set ) {
//			
//			System.out.println(value.price+", "+value.manufacturingYear+", "+value.version);
//		}
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<String> set = new TreeSet<>(Collections.reverseOrder());
//
//		set.add("Laurene");
//		set.add("Jing");
//		set.add("Zhen");
//		set.add("Eileen");
//
//		Iterator<String> it = set.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<String> set = new TreeSet<>();
//
//		set.add("Laurene");
//		set.add("Jing");
//		set.add("Zhen");
//		set.add("Eileen");
//
//		Iterator<String> it = set.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<Integer> set = new TreeSet<>();
//
//		set.add(23);
//		set.add(100);
//		set.add(12);
//		set.add(34);
//		
//		System.out.println(set.add(12));
//
//		Iterator<Integer> it = set.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}
//	}
//}

//public class Collectionn {// Iteration of Set through itertor() even though we can iterate Set with
//	// Enhanced for loop...
//
//	public static void main(String[] args) {
//
//		Set<Integer> set = new LinkedHashSet<>();//This is second implementation class of Set interface
//						//and it maintains insertion order that means you will get the elements bacl to you
//						//in the same order in which they were inserted since It maintains order internally
//					//on the basis of index....
//
//		set.add(23);
//		set.add(100);
//		set.add(12);
//		set.add(34);
//		
//		System.out.println(set.add(12));
//
//		Iterator<Integer> it = set.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}
//	}
//}

//public class Collectionn {//Iteration of Set through itertor() even though we can iterate Set with
//						//Enhanced for loop...
//
//	public static void main(String[] args) {
//
//		Set<Integer> set = new HashSet<>();
//		
//		set.add(23);   set.add(100);   set.add(12);   set.add(34);
//		
//		Iterator<Integer> it =  set.iterator();
//		
//		while( it.hasNext() ) {
//			
//			System.out.println(it.next());
//		}
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<Integer> set = new HashSet<>();
//		
//		set.add(23);   set.add(100);   set.add(12);   set.add(34);
//		
//		for(int value : set) {
//			
//			System.out.println( value );
//		}
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Set<Integer> set = new HashSet<>();//HashSet is one of the implementation class of Set interface
//									//as Set says, I am unique and HashSet says, I am unique since I am 
//							//the child of Set interface and I do not maintain insertion order
//			//If you run this program, you might not get the element in the order in which they were 
//				//inserted....
//		
//		set.add(23);   set.add(100);   set.add(12);   set.add(34);
//		
//		System.out.println(set.add(100));
//		
//		for(int value : set) {
//			
//			System.out.println( value );
//		}
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		LinkedList<Integer> list = new LinkedList<>();
//		
//		list.add(4);
//		list.add(32);
//		list.add(56);
//		
//		//System.out.println("First Element is "+list.getFirst());
//		list.addFirst(100);
//		
//		for( int value : list ) {
//			
//			System.out.println(value);
//		}	
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = new Vector<>();
//		
//		list.add(4);
//		list.add(32);
//		list.add(56);
//		
//		Vector<Integer> vector = (Vector<Integer>) list;
//		
//		vector.addElement(100);
//		
//		System.out.println(list.add(4));
//		
//		System.out.println(list.size());
//	
//		for( int value : vector ) {
//			
//			System.out.println(value);
//		}	
//	}
//}

//public class Collectionn {
//
//	public static void main(String[] args) {
//
//		Vector<Integer> list = new Vector<>();
//		
//		list.add(4);
//		list.add(32);
//		list.add(56);
//		
//		list.addElement(100);
//		
//		System.out.println(list.add(4));
//		
//		System.out.println(list.size());
//	
//		for( int value : list ) {
//			
//			System.out.println(value);
//		}
//		
//		System.out.println("First Element is "+list.firstElement());
//		System.out.println("Last Element is "+list.lastElement());
//	}
//}

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
////		for (Integer i : list) {
////
////			System.out.println(i);
////		}
////		
////		System.out.println(list.contains(56));
////		
////		System.out.println("the index is "+list.indexOf(1));
////		
////		list.clear();
////		
////		System.out.println("The size is "+list.size());
//		
//		Object[] data = list.toArray();
//		
//		for(Object integer : data) {
//			
//			System.out.println(integer);
//		}
//		
//		
//	}
//}

//publilc class Collectionn {
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
