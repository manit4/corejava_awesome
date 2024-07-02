import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class DateTimeAPIJava8 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2001, 12, 7);
		LocalDate date2 = LocalDate.now();
		
		Period period = Period.between(date1, date2);
		
		int year = date1.getYear();
		
		int totalDays = 0;
		
		for(int i = 0; i < period.getYears(); i++) {
			
			System.out.println(year);
			LocalDate dateIn = LocalDate.of(year, 1, 1);
			
			if(dateIn.isLeapYear()) {
				totalDays = totalDays + 366;
			}
			else {
				totalDays += 365;
			}
			year++;
		}
		
		System.out.println(totalDays);

	}
}



//public class DateTimeAPIJava8 {
//
//	public static void main(String[] args) {
//
//		LocalDate date1 = LocalDate.of(2001, 12, 7);
//		LocalDate date2 = LocalDate.now();
//		
//		Period period = Period.between(date1, date2);
//		
//		System.out.println(period.getYears());
//		System.out.println(period.getYears() * 365);
//		
//		System.out.println(period.getMonths()* 31);
//		System.out.println(period.getDays());
//		
//		System.out.println(period.toTotalMonths());
//		
//		System.out.println(ChronoUnit.YEARS.between(date1, date2));
//
//	}
//}


//public class DateTimeAPIJava8 {
//
//	public static void main(String[] args) {
//
//		LocalDateTime dateTime = LocalDateTime.of(2000, 9, 5, 22, 15);
//
//		System.out.println(dateTime);
//
//		System.out.println(dateTime.getDayOfWeek());
//		System.out.println(dateTime.getDayOfYear());
//		System.out.println(dateTime.getDayOfMonth());
//		System.out.println(dateTime.getHour());
//		System.out.println(dateTime.getMinute());
//
//	}
//}

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
