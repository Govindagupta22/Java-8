package Question_1;

import java.util.ArrayList;
import java.util.List;


public class DisplayEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=new ArrayList<>();
		
		employeeList.add(new Employee(1,"Govinda","Bangalore",40000));
		employeeList.add(new Employee(2,"Seema","Bangalore",35000));
		employeeList.add(new Employee(3,"Pooja","Mumbai",20000));
		employeeList.add(new Employee(4,"Deepak","Poland",35000));
		
		System.out.println("------------Iterating by passing lambda expression--------------");  
		employeeList.forEach(employee->System.out.println(employee));
		

		System.out.println("------------Iterating by using Method Reference--------------");  
		employeeList.forEach(System.out::println);
		

	}

}
