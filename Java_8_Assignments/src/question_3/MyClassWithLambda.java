package question_3;

import java.util.Arrays;
import java.util.stream.Stream;

public class MyClassWithLambda implements WordCount {

	@Override
	public int count(String str) {
		
        //using lambda expression
		int count=(int) Stream.of(str).flatMap(s ->Arrays.stream(s.split("\\s+"))).count();
		
		return count;
	}
	
	public static void main(String[] args)
	{
		String str="Wipro Technologies";
		MyClassWithLambda s=new MyClassWithLambda();
		
		System.out.println("No of Words in a given String is: "+s.count(str));
	}

	
}
