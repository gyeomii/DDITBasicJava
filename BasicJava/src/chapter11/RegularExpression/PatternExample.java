package chapter11.RegularExpression;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp1 = "(02|010)-\\d{3,4}-\\d{4}";
		String data1 = "010-1234-5678";	
		String data2 = "011-123-1234";	
		String data3 = "02-1234-123";	
		
		boolean result1 = Pattern.matches(regExp1, data1); // true
		boolean result2 = Pattern.matches(regExp1, data2); // false
		boolean result3 = Pattern.matches(regExp1, data3); // false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		String regExp2 = "^[a-zA-Z]*$";
		String input = "ABCdeZzZjf";
		boolean result4 = Pattern.matches(regExp2, input);	// true
		System.out.println(result4);
		
		String input2 = "ABcDe1Zzf";
		boolean result5 = Pattern.matches(regExp2, input2); // false
		System.out.println(result5);


	}
}
