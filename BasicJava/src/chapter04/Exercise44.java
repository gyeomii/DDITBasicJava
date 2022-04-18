package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String chulsu = scanner.next();
		System.out.print("영희: ");
		String younghee = scanner.next();
		
		if(chulsu.equals(younghee)) {
			System.out.println("결과: 비김!");
		}
		if(chulsu.equals("가위")) {
			if(younghee.equals("바위")){
				System.out.println("결과: 영희 승리!");
			}
			else if(younghee.equals("보")) {
				System.out.println("결과: 철수 승리!");
			}
		}
		if(chulsu.equals("바위")) {
			if(younghee.equals("가위")){
				System.out.println("결과: 철수 승리!");
			}
			else if(younghee.equals("보")) {
				System.out.println("결과: 영희 승리!");
			}
		}
		if(chulsu.equals("보")) {
			if(younghee.equals("가위")){
				System.out.println("결과: 영희 승리!");
			}
			else if(younghee.equals("바위")) {
				System.out.println("결과: 철수 승리!");
			}
		}
		
	}
}
