package question_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("First","Second","Third","Fourth","Fifth","","Sixth","","Seventh");
		
		int c=(int) list.stream().filter(s ->s.length()>5).count();
		System.out.println("No of Strings in a List whose Length is >5 is " +c);
		
		int emptyCount=(int) list.stream().filter(s ->s.isEmpty()).count();
		System.out.println("No of empty String in a List is " +emptyCount);
		
		System.out.println("The Original List: ");
		list.forEach(s->System.out.print(s+" "));
		
		System.out.println("\nAdding empty String to Another List and Printing Empty List");
		List<String> list1=list.stream().filter(s->s.isEmpty()).collect(Collectors.toList());
		list1.forEach(System.out::println);
		System.out.println("Empty List is printed above");
		
		
		
		

	}

}
