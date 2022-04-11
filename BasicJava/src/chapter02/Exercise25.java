package chapter02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		
		//동전의 갯수에 따른 총 금액을 구해보자
		
		Scanner scanner = new Scanner(System.in);
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int total;
		
		System.out.print("500원짜리 동전의 갯수: ");
		coin500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		coin100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		coin50 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		coin10 = scanner.nextInt();
		
		total = (500 * coin500) + (100 * coin100) + (50 * coin50) + (10 * coin10);
		
		System.out.println("저금통 안의 동전의 총 액수: " + total);
		
	}

}
