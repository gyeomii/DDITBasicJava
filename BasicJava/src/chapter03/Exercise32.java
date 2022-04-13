package chapter03;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		//input
		System.out.print("수도입니까?(수도: 1, 수도아님: 0): ");
		int capital = scanner.nextInt();
		
		System.out.print("총 인구는?(단위: 만): ");
		int popularity = scanner.nextInt();
		
		System.out.print("연 소득이 1억 이상인 인구는?(단위: 만): ");
		int income = scanner.nextInt();
		
		//data processing
		String metro = ((capital == 1) && (popularity >= 100)) || (income >= 50)  ? "입니다." : "가 아닙니다.";
		
		//output
		System.out.println("이 도시는 메트로폴리스" + metro);
	}
}
