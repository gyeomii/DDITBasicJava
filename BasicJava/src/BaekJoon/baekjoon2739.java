package BaekJoon;

import java.util.Scanner;

public class baekjoon2739 {
	public static void main(String[] args) {
		//multiplication table
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단의 단수를 입력하세요. : ");
		int num = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i +  " = " + num*i);
		}
	}
}
