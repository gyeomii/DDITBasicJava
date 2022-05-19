package chapter04Example;

import java.util.Scanner;

public class Exercise43_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total;
		double avg;
		String grade;
		int avgInt;
		
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
		avgInt = (int)avg/10;
		
		switch (avgInt) {
		case 10: case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg );
		System.out.printf("학점: %s", grade);
		scanner.close();
	}
}