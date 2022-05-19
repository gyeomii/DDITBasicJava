package chapter03;

import java.util.Scanner;

public class Example9 {
		public static void main(String[] args) {
	    Scanner scanner =  new Scanner(System.in);
	
	    String str1;
	    String str2;
	
	    System.out.print("첫 번째 수: ");
	    str1 = scanner.next();
	    System.out.print("두 번째 수: ");
	    str2 = scanner.next();
	
	    double str1Double = Double.parseDouble(str1);
	    double str2Double = Double.parseDouble(str2);
	    double result = str1Double / str2Double;
	System.out.println("-----------------");
	
	 if(str2Double != 0.0) {
    	System.out.println("결과:" + result);
	    }
	    else 
	    	System.out.println("결과:무한대");
		}
}


