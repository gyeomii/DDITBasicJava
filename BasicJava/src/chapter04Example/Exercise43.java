package chapter04Example;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total;
		double avg;
		String grade;
		
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
		avg = total / 5.0;
		
		if(avg>=90) {
			grade = "A";
		}
		else if(avg>=80){
			grade = "B";
		}
		else if(avg>=70) {
			grade = "C";
		}
		else if(avg>=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg );
		System.out.printf("학점: %s", grade);
		scanner.close();
	}
}
