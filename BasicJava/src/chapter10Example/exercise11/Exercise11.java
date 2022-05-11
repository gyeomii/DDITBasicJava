package chapter10Example.exercise11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			try {
			System.out.print("어떤 수를 나누시겠습니까?>> ");
			int num = scanner.nextInt();
			System.out.print("어떤 수로 나누시겠습니까?>> ");
			int divider = scanner.nextInt();
			// ArithmeticException이 있는줄 모르고 if문으로 RuntimeException을 던짐
			/*if (num == 0 || divider == 0) {
				throw new RuntimeException("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} else {*/
				int divideresult = num / divider;
				System.out.println(num + "/" + divider + " = " + divideresult);
				run = false;
				scanner.close();
		  /*}*/
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.next();
				continue;
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."/*e.getMessage()*/);
				continue;
			}
		}
	}
}