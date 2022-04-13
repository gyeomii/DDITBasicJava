package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//input
		System.out.print("첫 번째 정수를 입력하세요: ");
	    int num1 = scanner.nextInt();
	    System.out.print("두 번째 정수를 입력하세요: ");
	    int num2 = scanner.nextInt();
	    //data processing
	    int quotient = (((num1 + num2) + Math.abs(num1 - num2))/2) / (((num1 + num2) - Math.abs(num1 - num2))/2);
	    int remains =  (((num1 + num2) + Math.abs(num1 - num2))/2) % (((num1 + num2) - Math.abs(num1 - num2))/2);
	    //output
	    System.out.println("큰 수를 작은 수로 나눈 몫은 " + quotient + "이고, 나머지는 " + remains + "이다.");
	}
}
