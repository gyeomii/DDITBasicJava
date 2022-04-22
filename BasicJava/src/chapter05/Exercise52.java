package chapter05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lottoNum = new int[6];
		int temp;
		
		
			for (int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = random.nextInt(45) + 1;
					for (int j = 0; j < i; j++) {   //중복제거
						if (lottoNum[i] == lottoNum[j]) {
							i--;
							break;
						}
					}
			}
			for (int i = 0; i < lottoNum.length; i++) {  //내림차순 정렬
					for (int j = 0; j < i; j++) {
						if (lottoNum[i] < lottoNum[j]) {
							temp = lottoNum[i];
							lottoNum[i] = lottoNum[j];
							lottoNum[j] = temp;
						}
					}
			}
			System.out.print("로또번호: ");
			for (int i = 0; i < lottoNum.length; i++) {
				System.out.print(" " + lottoNum[i]);
			}
				
	}
}
