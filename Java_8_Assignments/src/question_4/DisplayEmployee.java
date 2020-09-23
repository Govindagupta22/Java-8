package question_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DisplayEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=new ArrayList<>();
		
		employeeList.add(new Employee(1,"Govinda","Bangalore",40000));
		employeeList.add(new Employee(2,"Seema","Bangalore",35000));
		employeeList.add(new Employee(3,"Pooja","Mumbai",20000));
		employeeList.add(new Employee(4,"Deepak","Poland",35000));
		
		System.out.println("------------Employee List before Sorting--------------");  
		employeeList.forEach(employee->System.out.println(employee));
		
		Collections.sort(employeeList, Employee::compareBySal);
		System.out.println();
		System.out.println("------------EmployeeList After Sorting based on Salary using method reference--------------");  
		employeeList.forEach(System.out::println);
		

	}

}
