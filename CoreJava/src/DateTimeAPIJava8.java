import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPIJava8 {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.of(2000, 9, 5, 22, 15);

		System.out.println(dateTime);

		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());

	}
}

//public class DateTimeAPIJava8 {
//	
//	public static void main(String[] args) {
//		
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime);
//		
//		System.out.println(dateTime.getDayOfWeek());
//		System.out.println(dateTime.getDayOfYear());
//		System.out.println(dateTime.getDayOfMonth());
//		System.out.println(dateTime.getHour());
//		System.out.println(dateTime.getMinute());
//	}
//}

//public class DateTimeAPIJava8 {
//	
//	public static void main(String[] args) {
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
//		System.out.println(time.getHour());
//		System.out.println(time.getMinute());
//		System.out.println(time.getSecond());
//		System.out.println(time.getNano());
//	}
//}

//public class DateTimeAPIJava8 {
//	
//	public static void main(String[] args) {
//		
//		LocalDate date = LocalDate.now();
//		
//		System.out.println(date);
//		System.out.println(date.getDayOfYear());
//		System.out.println(date.getDayOfWeek());
//		System.out.println(date.getDayOfMonth());
//	}
//
//}

//import java.util.Date;
//
//public class DateTimeAPIJava8 {
//	
//	public static void main(String[] args) {
//		
//		Date date = new Date();
//		
//		System.out.println(date.getDate());
//	}
//
//}
