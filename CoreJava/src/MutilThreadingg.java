
class MyThread extends Thread {
	
	int total = 0;
	
	public void run() {
		
		for( int i = 0; i < 50; i++ ) {
			
			total = total + i;
			
		}	
		System.out.println("total is done..."+total);
		synchronized ( this ) {
			notify();
			System.out.println("After notify()");
		}
	}
}

public class MutilThreadingg {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread eileen = new MyThread();    eileen.setName("eileen");
		
		eileen.start();
		
		synchronized ( eileen ) {
			eileen.wait(10000);
		}	
		System.out.println("total is "+eileen.total);
				
	}
}




//class MyThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		for( int i = 0; i < 50; i++ ) {
//			
//			total = total + i;
//			
//		}	
//		System.out.println("total is done..."+total);
//		synchronized ( this ) {
//			notify();
//			System.out.println("After notify()");
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread eileen = new MyThread();    eileen.setName("eileen");
//		
//		eileen.start();
//		
//		Thread.sleep(1000);
//		synchronized ( eileen ) {
//			eileen.wait(10000);//this wait is overloaded and will stay in the waiting area only for 
//								//the time specified if not notified....
//		}	
//		System.out.println("total is "+eileen.total);
//				
//	}
//}


//class MyThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		for( int i = 0; i < 50; i++ ) {
//			
//			total = total + i;
//			
//		}	
//		System.out.println("total is done..."+total);
//		synchronized ( this ) {
//			notify();
//			System.out.println("After notify()");
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread eileen = new MyThread();    eileen.setName("eileen");
//		
//		eileen.start();
//		
//		Thread.sleep(1000);
//		synchronized ( eileen ) {
//			eileen.wait();
//		}	
//		System.out.println("total is "+eileen.total);
//				
//	}
//}



//
//class MyThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		for( int i = 0; i < 50; i++ ) {
//			
//			total = total + i;
//		}	
//		synchronized ( this ) {
//			notify();
//		}
//		for( int i = 0; i < 10000; i++ ) {
//			System.out.println(i);
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread eileen = new MyThread();    eileen.setName("eileen");
//		
//		eileen.start();
//		
//		synchronized ( eileen ) {
//			System.out.println("inside main synchronised block");
//			eileen.wait();
//		}	
//		System.out.println("total is "+eileen.total);
//				
//	}
//}




//
//class MyThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		for( int i = 0; i < 50; i++ ) {
//			
//			total = total + i;
//		}		
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread eileen = new MyThread();    eileen.setName("eileen");
//		
//		eileen.start();
//		
//		eileen.wait();//here is the exception(IllegalMonitorStateException) since wait(), notify and notifyAll()				
//					//must be called from the Synchronized block...
//		
//		System.out.println("total is "+eileen.total);
//				
//	}
//}





//class MyThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		for( int i = 0; i < 50; i++ ) {
//			
//			total = total + i;
//		}		
//		for( int i = 0; i < 10000; i++) {
//			System.out.println(i);
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread eileen = new MyThread();    eileen.setName("eileen");
//		
//		eileen.start();
//		
//		eileen.join(1);//This join() is overloaded and will wait for the time specified not the thread
//						//joined to go to the dead state...
//		
//		System.out.println("total is "+eileen.total);
//				
//	}
//}

//class BankAccount {
//	
//	private int amount = 50;
//	
//	public void withdraw(int requestedAmount) {
//		
//		amount = amount - requestedAmount;
//	}
//	
//	public int balanceCheck() {
//		
//		return amount;
//	}
//}
//
//class MyRunnable implements Runnable {
//	
//	BankAccount account = new BankAccount();
//
//	@Override
//	public void run() {
//		
//		withdrawl(50);
//	}
//	
//	public void withdrawl(int amount) {
//		
//		System.out.println(Thread.currentThread().getName()+"validating credentials");
//		System.out.println(Thread.currentThread().getName()+"Validating credit score");
//		System.out.println(Thread.currentThread().getName()+"generating PDF Report");
//		System.out.println(Thread.currentThread().getName()+"Closing or Releasing Resources");
//		
//		synchronized (this) {
//			if(account.balanceCheck() >= amount) {
//				
//				System.out.println(Thread.currentThread().getName()+" withdrew amount...");
//				account.withdraw(amount);
//			}
//			else {
//				System.out.println(Thread.currentThread().getName()+"is trying to withdraw but Not Enough Amount");
//			}
//		}	
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread xi = new Thread(runnable);    xi.setName("xi");
//		Thread eileen = new Thread(runnable);     eileen.setName("eileen");
//		
//		xi.start();      eileen.start();
//				
//	}
//}




//
//class BankAccount {
//	
//	private int amount = 50;
//	
//	public void withdraw(int requestedAmount) {
//		
//		amount = amount - requestedAmount;
//	}
//	
//	public int balanceCheck() {
//		
//		return amount;
//	}
//}
//
//class MyRunnable implements Runnable {
//	
//	BankAccount account = new BankAccount();
//
//	@Override
//	public void run() {
//		
//		withdrawl(50);
//	}
//	
//	synchronized public void withdrawl(int amount) {
//		
//		
//		if(account.balanceCheck() >= amount) {
//	
//			System.out.println(Thread.currentThread().getName()+" withdrew amount...");
//			account.withdraw(amount);
//		}
//		else {
//			System.out.println(Thread.currentThread().getName()+"is trying to withdraw but Not Enough Amount");
//		}	
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread xi = new Thread(runnable);    xi.setName("xi");
//		Thread eileen = new Thread(runnable);     eileen.setName("eileen");
//		
//		xi.start();      eileen.start();
//				
//	}
//}



//
//class BankAccount {
//	
//	private int amount = 50;
//	
//	public void withdraw(int requestedAmount) {
//		
//		amount = amount - requestedAmount;
//	}
//	
//	public int balanceCheck() {
//		
//		return amount;
//	}
//}
//
//class MyRunnable implements Runnable {
//	
//	BankAccount account = new BankAccount();
//
//	@Override
//	public void run() {
//		
//		withdrawl(50);
//	}
//	
		//public void withdrawl(int amount) {
//
//		
//		if(account.balanceCheck() >= amount) {
//
//	try {
//		Thread.sleep(2000);
//	}
//	catch(Exception e) {
//		
//	}
			
//			System.out.println(Thread.currentThread().getName()+" withdrew amount...");
//			account.withdraw(amount);
//		}
//		else {
//			System.out.println(Thread.currentThread().getName()+"is trying to withdraw but Not Enough Amount");
//		}	
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread xi = new Thread(runnable);    xi.setName("xi");
//		Thread eileen = new Thread(runnable);     eileen.setName("eileen");
//		
//		xi.start();      eileen.start();
//				
//	}
//}


//class MyRunnable implements Runnable {
//
//	int total = 0;
//
//	public void run() {
//		
//		if(Thread.currentThread().getName().equals("Celia")) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.out.println("catch");
//				e.printStackTrace();
//			}
//			System.out.println("The total from the abc thread is "+total);
//		}
//		else {
//			for (int i = 0; i < 10; i++) {
//
//				total = total + i;
//			}
//			System.out.println("Total is from xyz is "+total);
//		}
//	}	
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//
//		Thread t1 = new Thread(runnable);     t1.setName("Celia");
//		Thread t2 = new Thread(runnable);     t2.setName("Eileen");
//		
//		t1.start();     t2.start();
//		
//	}
//}



//class MyRunnable implements Runnable {
//
//	@Override
//	public void run() {
//		
//		System.out.println("inside run()1");
//	}	
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//
//		Thread t1 = new Thread(runnable);     t1.setName("Celia");
//		Thread t2 = new Thread(runnable);     t2.setName("Eileen");
//		
//		t1.start();     t2.start();
//		
//	}
//}




//class PrintingThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		ComputingThread shwai = new ComputingThread(this);
//		shwai.start();
//		try {
//			shwai.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}	
//		System.out.println("Total is "+total);
//	}
//}
//
//class ComputingThread extends Thread {
//	PrintingThread printingThread;
//	
//	public ComputingThread(PrintingThread printingThread) {
//		this.printingThread = printingThread;
//	}
//	
//	public void run() {
//		
//		for(int i = 0; i < 10; i++) {
//			
//			printingThread.total = printingThread.total + i;
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		PrintingThread eileen = new PrintingThread();    eileen.setName("abc");
//		eileen.start();	
//	}
//}



//class WaiterThread extends Thread {
//	
//	int total = 0;
//
//	public void run() {
//		
//		if(Thread.currentThread().getName().equals("abc")) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.out.println("catch");
//				e.printStackTrace();
//			}
//			System.out.println("The total from the abc thread is "+total);
//		}
//		else {
//			for (int i = 0; i < 10; i++) {
//
//				total = total + i;
//			}
//			System.out.println("Total is from xyz is "+total);
//		}
//	}
//}
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		WaiterThread abc = new WaiterThread();    abc.setName("abc");
//		WaiterThread xyz = new WaiterThread();    xyz.setName("xyz");
//		
//		abc.start();    xyz.start();
//		
//	}
//}




//class WaiterThread extends Thread {
//	
//	int total = 0;
//
//	public void run() {
//		
//		for (int i = 0; i < 10; i++) {
//
//			total = total + i;
//			System.out.println("run()");
//		}
//	}
//}
//public class MutilThreadingg {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		WaiterThread abc = new WaiterThread();    abc.setName("abc");
//		
//		abc.start();
//		
//		abc.join();//here "main" thread will be in join with thread "abc" since this statement will be
//					//executed by the "main" thread. that means, post this statement execution, main thread
//					//will go in the waiting state until thread "abc" finished its task... 
//		
//		System.out.println(abc.total);
//	}
//}


//class WaiterThread extends Thread {
//	
//	int total = 0;
//
//	public void run() {
//		
//		for (int i = 0; i < 10; i++) {
//
//			total = total + i;
//			System.out.println("run()");
//		}
//	}
//}
//public class MutilThreadingg {
//
//	public static void main(String[] args) {
//
//		WaiterThread abc = new WaiterThread();    abc.setName("abc");
//		
//		abc.start();
//		
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(abc.total);
//		
//	}
//}




//class WaiterThread extends Thread {
//
//	public void run() {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		for (int i = 0; i < 100; i++) {
//
//			System.out.println(Thread.currentThread().getName()+" and i is "+i);
//		}
//	}
//}
//public class MutilThreadingg {
//
//	public static void main(String[] args) {
//
//		WaiterThread waiter1 = new WaiterThread();    waiter1.setName("abc");
//		WaiterThread waiter2 = new WaiterThread();    waiter2.setName("xyz");
//		
//		waiter1.start();   
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		waiter2.start();		
//		
//		for (int i = 0; i < 10; i++) {
//
//			System.out.println(Thread.currentThread().getName()+" and i is "+i);
//		}
//	}
//}



//
//class WaiterThread extends Thread {
//
//	public void run() {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		for (int i = 0; i < 10; i++) {
//
//			System.out.println(Thread.currentThread().getName()+" and i is "+i);
//		}
//	}
//}
//public class MutilThreadingg {
//
//	public static void main(String[] args) {
//
//		WaiterThread waiter1 = new WaiterThread();    waiter1.setName("abc");
//		WaiterThread waiter2 = new WaiterThread();    waiter2.setName("xyz");
//		
//		waiter1.start();     waiter2.start();		
//		
//		for (int i = 0; i < 10; i++) {
//
//			System.out.println(Thread.currentThread().getName()+" and i is "+i);
//		}
//	}
//}



//
//
//class WaiterThread extends Thread {
//
//	public void run() {
//
//		for (int i = 0; i < 20; i++) {
//
//			System.out.println(Thread.currentThread().getName()+" and i is "+i);
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) {
//
//		WaiterThread waiter1 = new WaiterThread();
//		WaiterThread waiter2 = new WaiterThread();
//		
//		waiter1.setName("abc");
//		waiter2.setName("xyz");
//
//		waiter1.start();     waiter2.start();
//
//	}
//}


//class WaiterThread extends Thread {
//
//	public void run() {
//
//		for (int i = 0; i < 20; i++) {
//
//			System.out.println("WaiterThread " + i);
//		}
//	}
//}
//
//class CookThread extends Thread {
//
//	public void run() {
//
//		for (int i = 0; i < 20; i++) {
//
//			System.out.println("CookThread " + i);
//		}
//	}
//}
//
//public class MutilThreadingg {
//
//	public static void main(String[] args) {
//
//		WaiterThread waiter1 = new WaiterThread();
//		WaiterThread waiter2 = new WaiterThread();
//		CookThread cook = new CookThread();
//
//		waiter1.start();     waiter2.start();
//		cook.start();
//
//	}
//}

//
//class WaiterThread extends Thread {
//	
//	public void run() {
//		
//		System.out.println("WaiterThread...");
//	}
//}
//
//class CookThread extends Thread {
//	
//	public void run() {
//		
//		System.out.println("CookkThread...");
//	}
//}
//
//public class MutilThreadingg {
//	
//	public static void main(String[] args) {
//		
//		WaiterThread waiter = new WaiterThread();
//		CookThread cook = new CookThread();
//		
//		waiter.start();
//		cook.start();
//		
//	}
//}

//
//class MyThread extends Thread {
//	
//	public void run() {
//		
//		for( int i = 0; i < 40; i++ ) {
//			
//			System.out.println(i);
//		}
//	}
//}
//
//
//public class MutilThreadingg {
//	
//	public static void main(String[] args) {
//		
//		MyThread emp1 = new MyThread();
//		MyThread emp2 = new MyThread();
//		
//		emp1.start();
//		emp2.start();
//		
//	}
//
//}

//class MyThread extends Thread {
//	
//	public void run() {
//		
//		System.out.println("inside run()...");
//	}
//}
//
//
//public class MutilThreadingg {
//	
//	public static void main(String[] args) {
//		
//		MyThread emp1 = new MyThread();//This is just normal thread class Object but not the thread of 
//								//Excecution that means you will not see thread/s are actually waiting for 
//								//running since for making thread eligible to run then you have to put 
//							//the thread/s in the Thread Pool and to put the tread in the Thread Pool then
//						//you have to call start() on each thread.
//		MyThread emp2 = new MyThread();
//		
//		emp1.start();//calling start() on thread class object will put the thread in the Thread Pool and 
//					//after that thread/s will have to wait for the system to give processor-time to execute 
//					//or start running....
//		emp2.start();
//	}
//
//}
