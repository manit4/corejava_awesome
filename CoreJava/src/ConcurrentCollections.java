import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class MyRunnable implements Runnable {

	//ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
	Hashtable<Integer, String> map = new Hashtable<>();//This will be fine as well however, this Hashtable
				//class is slower than ConcurrentHashMap...

	public MyRunnable() {

		map.put(101, "Eileen");
		map.put(102, "Xi");
		map.put(103, "Jing");
		map.put(104, "Zhen");
		map.put(105, "Laurene");
		map.put(106, "Celia");
		map.put(107, "Shuai");
	}

	@Override
	public void run() {

		map.put(108, "Manit");
	}
}

public class ConcurrentCollections {

	public static void main(String[] args) {

		MyRunnable runnable = new MyRunnable();

		Thread t1 = new Thread(runnable);    t1.setName("eileen");  
		t1.start();
		
		Set<Integer> set = runnable.map.keySet();
		
		for( Integer value : set ) {
			
			System.out.println(runnable.map.get(value));
		}
		
	}
}

//public class ConcurrentCollections {
//
//	public static void main(String[] args) {
//
//		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
//		
//		map.put(100, "Celia");
//		map.put(101, "Eileen");
//		map.put(102, "Xi");
//		
//		//map.replace(101, "Shuai");
//		
//		map.replace(101, "Eileen", "Shuai");
//		
//		Set<Integer> set = map.keySet();
//		
//		for( Integer val : set ) {
//			
//			System.out.println(map.get(val));
//		}
//
//	}
//}

//public class ConcurrentCollections {
//
//	public static void main(String[] args) {
//
//		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
//		
//		map.put(100, "Celia");
//		map.put(101, "Eileen");
//		map.put(102, "Xi");
//		
//		//map.remove(101);
//		
//		map.remove(101, "Jing");
//		
//		Set<Integer> set = map.keySet();
//		
//		for( Integer val : set ) {
//			
//			System.out.println(map.get(val));
//		}
//
//	}
//}

//public class ConcurrentCollections {
//
//	public static void main(String[] args) {
//
//		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
//		
//		map.put(100, "Celia");
//		map.put(101, "Eileen");
//		map.put(102, "Xi");
//		map.put(101, "Shuai");
//		
//		map.putIfAbsent(102, "Jing");
//		
//		Set<Integer> set = map.keySet();
//		
//		for( Integer val : set ) {
//			
//			System.out.println(map.get(val));
//		}
//
//	}
//}

//class MyRunnable implements Runnable {//This CopyOnWriteArrayList will save you from the ConcurrencyModificationException 
//									//which was raised when used ArrayList 
//							//This CopyOnWriteArrayList is thread safe as Vector(another implementation
//				//class of List(I) but CopyOnWriteArrayList is faster than Vector
//	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//	
//	MyRunnable() {
//		
//		list.add(12);  list.add(12);   list.add(12);   list.add(12);   list.add(12);   list.add(12);  list.add(12);
//		list.add(12);   list.add(12);   list.add(12);   list.add(12);   list.add(12);  list.add(12);list.add(12);
//	}
//	
//	public void run() {
//
//		list.add(100);
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//
//public class ConcurrentCollections {
//
//	public static void main(String[] args) {
//
//		MyRunnable runnable = new MyRunnable();
//
//		Thread t1 = new Thread(runnable);      t1.setName("celia");
//		
//		t1.start();
//		
//		for( Integer value : runnable.list ) {
//			
//			System.out.println(Thread.currentThread().getName()+", "+value);
//		}
//
//	}
//}

//class MyRunnable implements Runnable {
//	
//	StringBuffer buffer = new StringBuffer("");
//	
//	public void run() {
//		
//		for( int i = 0; i < 2; i++ ) {
//			
//			buffer.append(""+i);
//		}
//		
//		System.out.println(buffer);
//	}
//}
//
//public class ConcurrentCollections {
//	
//	public static void main(String[] args) {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread t1 = new Thread(runnable);   t1.setName("celia");
//		Thread t2 = new Thread(runnable);   t2.setName("jing");
//		
//		t1.start();     t2.start();
//	}
//}
