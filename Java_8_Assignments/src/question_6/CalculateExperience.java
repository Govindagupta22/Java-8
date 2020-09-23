package question_6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		
		LocalDate dateOfJoining = LocalDate.of(2019, Month.OCTOBER, 14); 
	  
		 Period period = Period.between(dateOfJoining, today);
		
		 System.out.println("Experience in Wipro:");
		 System.out.println(period.getYears()+"years "+period.getMonths()+"months "+period.getDays()+"days");
		 

	}

}
