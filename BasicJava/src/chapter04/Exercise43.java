package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total;
		double avg;
		
		System.out.println("점수를 입력하세요");
		System.out.print("프로그래밍 기초: ");
		int program = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int db = scanner.nextInt();
		System.out.print("화면구현: ");
		int ui = scanner.nextInt();
		System.out.print("애플리케이션구현: ");
		int app = scanner.nextInt();
		System.out.print("머신러닝: ");
		int machine = scanner.nextInt();
		
		total = program + db + ui + app + machine;
		avg = (double)total / 5;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg );
		if(avg>=90) {
			System.out.println("학점: A");
		}
		else if(avg>=80 && avg<90){
			System.out.println("학점: B");
		}
		else if(avg>=70 && avg<80) {
			System.out.println("학점: C");
		}
		else if(avg>=60 && avg<70) {
			System.out.println("학점: D");
		}
		else {
			System.out.println("학점: F");
		}
	}
}
