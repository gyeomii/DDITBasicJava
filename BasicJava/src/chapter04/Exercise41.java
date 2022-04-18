package chapter04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int leg1, leg2, leg3;
	
	System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
	leg1 = scanner.nextInt();
	System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
	leg2 = scanner.nextInt();
	System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
	leg3 = scanner.nextInt();

	if(leg1 + leg2 < leg3 || leg1 + leg3 < leg2 || leg2 + leg3 < leg1) {
		System.out.println("삼각형을 만들 수 없습니다.");
	}else {
		System.out.println("삼각형을 만들 수 있습니다.");
	}
}
}
