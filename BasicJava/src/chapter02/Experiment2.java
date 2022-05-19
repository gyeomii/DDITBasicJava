package chapter02;

import java.util.Scanner;

public class Experiment2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수정보입력]");
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String privatNum = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String telNum = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + privatNum);
		System.out.println("3. 전화번호: " + telNum);
		
		String tel1 = "010"; String tel2 = "123"; String tel3 = "1234";
		System.out.printf("전화: %1$s-%2$s-%3$s", tel1, tel2, tel3);
		//1$ -> 첫번째 변수를 사용한다는 의미, 2$두번쨰, 3$세번째
	}
	
}
