package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HandlingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date & Time: "+currentDateTime);
		
		LocalDate date = LocalDate.parse("1997-10-24");//setting date by passing string
		System.out.println("Date: "+date);
		
		LocalDate date2 = LocalDate.of(2005,5,10);//setting date by passing integers
		System.out.println("Date: "+date2);
		

	}

}
