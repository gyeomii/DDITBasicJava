package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int computer = random.nextInt(3);
		String computerString;
		
		if(computer == 0) {
			computerString = "가위";
		}else if(computer == 1){
			computerString = "바위";
		}else {
			computerString = "보";
			}
		
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String human = scanner.nextLine();
		
		System.out.println("게이머: " + human);
		System.out.println("인공지능: " + computerString);
		
		String result;
		if(computerString.equals(human)) {
			result = "무승부!";
		}else if(computerString.equals("가위") && human.equals("바위")
				 ||computerString.equals("바위") && human.equals("보")
				 ||computerString.equals("보") && human.equals("가위")){
			 result = "게이머 승리!";
		}else {
			result = "컴퓨터 승리!";
		}
		System.out.println("결과: " + result);
		scanner.close();
	}
}
