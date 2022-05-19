package chapter04;

import java.util.Random;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		Random random = new Random();
		int time = random.nextInt(4)+8;
		System.out.println("[현재시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근을 나갑니다.");
			
		//break; 가 없으면 switch case문은 멈추지 않는다.
		}
	}
}
