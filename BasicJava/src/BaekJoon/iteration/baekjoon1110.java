package BaekJoon.iteration;

import java.util.Scanner;

public class baekjoon1110 {
	//PlusCycle
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("숫자 입력: ");
			int num = scanner.nextInt();
			scanner.close();
						
			int count = 0;
			int numCopy = num;
				     
			while (true) {
				num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
				count++;
				
				if (numCopy == num) {
					break;
					}
				}
			System.out.println(numCopy + "의 사이클 길이: " + count);			
		}
}
