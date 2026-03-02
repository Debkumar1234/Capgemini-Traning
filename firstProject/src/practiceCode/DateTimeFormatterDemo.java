package practiceCode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		System.out.println(today);
		System.out.println(futureDate);
		
		if(futureDate.isAfter(today)) {
			System.out.println("Future date is valid");
		}
		
		Period period= Period.between(today, futureDate);
		System.out.println("Days between days : " + period.getDays());
		
		LocalDateTime currentTimestamp = LocalDateTime.now();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Formatted Date : " + today.format(dateFormatter));
		System.out.println("Formatted Date-Time: "+ currentTimestamp.format(dateTimeFormatter));
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfMonth());
		System.out.println("Original date still unchanged: "+ today);
	}

}
