package chapter04;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int credit = 0;
		int outMoney = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int getNum = scanner.nextInt();
				while(getNum == 1) {
					System.out.print("예금액> ");
					credit = scanner.nextInt();
					balance += credit;
					break;
				}
				while(getNum == 2) {
					System.out.print("출금액> ");
					outMoney = scanner.nextInt();
					balance -= outMoney;
					break;
				}
				while(getNum == 3) {
					System.out.println("잔고> " + balance);
					break;
				}
				while(getNum == 4){
					run = false;
					break;
				}
			}
		System.out.println("             ");
		System.out.println("프로그램 종료");
		}
}

