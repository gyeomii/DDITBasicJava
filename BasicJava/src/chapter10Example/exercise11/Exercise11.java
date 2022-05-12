package chapter10Example.exercise11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				double dividend = scanner.nextDouble();
				System.out.print("어떤 수로 나누시겠습니까?>> ");
				double divisor = scanner.nextDouble();

				double quotient = (double) dividend / divisor;
				System.out.printf("%.3f / %.3f = %.5f", dividend, divisor, quotient);
				run = false;
				scanner.close();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.next();
				continue;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."/* e.getMessage() */);
				continue;
			}
		}
	}
}