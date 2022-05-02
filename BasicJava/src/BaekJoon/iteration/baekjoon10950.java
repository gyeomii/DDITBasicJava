package BaekJoon.iteration;

import java.util.Scanner;

public class baekjoon10950 {
	public static void main(String[] args) {
		//A+B(3)
		Scanner scanner = new Scanner(System.in);
		System.out.print("실행할 횟수를 입력하세요: ");
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println(num1 + num2);
		}
		scanner.close();
	}
}
