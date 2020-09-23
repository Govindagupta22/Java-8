package question_5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DisplayDate {
	
	public static void main(String[] args)
	{
		LocalDate today=LocalDate.now();
		System.out.println("-----------Today's date is printed using java time API----------------");
		System.out.println(today);
		
		LocalDate nextMonth=today.plus(1,ChronoUnit.MONTHS);
		LocalDate nextMonthSecondSundaydate=nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		
		System.out.println("-----------the date of next month second Sunday by using java time API----------------");
		System.out.println(nextMonthSecondSundaydate);
	}

}
