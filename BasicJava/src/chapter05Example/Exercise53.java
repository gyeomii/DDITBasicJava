package chapter05Example;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String[] com = {"가위", "바위", "보"};
		int num = random.nextInt(3);
		
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String human = scanner.nextLine();
		
		System.out.println("게이머: " + human);
		System.out.println("인공지능: " + com[num]);
		
		String result = "";
		if(com[num].equals(human)) {
			result = "무승부!";
		}else if(com[num].equals("가위") && human.equals("바위")
				 ||com[num].equals("바위") && human.equals("보")
				 ||com[num].equals("보") && human.equals("가위")){
			 result = "게이머 승리!";
		}else {
			result = "인공지능 승리!";
		}
		System.out.println("결과: " + result);
		scanner.close();
	}
}
