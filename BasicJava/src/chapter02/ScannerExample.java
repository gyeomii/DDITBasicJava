package chapter02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  //Quick Fix (ctrl + 1)
	  /*
	  scanner.next(); // 문자 입력받기(공백 또는 엔터가 입력된 부분까지)
	  scanner.nextLine();//문자 입력받기(엔터가 입력된 부분까지)
	  scanner.nextInt();//정수 입력받기
	  scanner.nextDouble();//실수 입력받기
	  
	   * printf("잔액: %,d, 1000000);
	   * printf("소숫점 둘째자리: %.2f, 10.21355);
	   * 혼공자 책 91p 참조하기
	   */
	  while(true) {
	  System.out.print("이름을 입력하세요: ");
	  String stringData = scanner.next();
	  
		if(stringData.equals("quit")) {
	  		break;
	  	}
		
	  System.out.print("나이를 입력하세요: ");
	  int intData = scanner.nextInt();

	  	System.out.println("이름: " + stringData + "\n나이: " + intData);
	  	System.out.printf("이름: %s\n나이: %d\n",stringData, intData);
	  }
	  System.out.println("종료");
	}

}
