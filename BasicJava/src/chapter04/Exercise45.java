package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNum = random.nextInt(100)+1;
		int inputNum;
		int count = 0;
	
		 do {
	          System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
	          inputNum = scanner.nextInt();

	          if(randomNum > inputNum){
	        	  System.out.println("정답은 더 큰 수 입니다.");
	        	  }else if(randomNum < inputNum){
	        	  System.out.println("정답은 더 작은 수 입니다.");
	        	  }
	          count++;
	        }               
	        while (randomNum != inputNum);
	        System.out.println("정답입니다. " + count + "번 만에 맞추셨습니다\n게임을 종료합니다.") ;
	        scanner.close();
	}
}
