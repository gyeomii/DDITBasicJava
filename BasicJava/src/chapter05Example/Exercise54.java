package chapter05Example;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		int diceNum;
		int[] diceCount = new int[6];
		
		/* 내가 생각한 코드
		 * for (int i = 0; i < 10000; i++) {
			diceNum = random.nextInt(6) + 1;
			if(diceNum == 1) {
				diceCount[0]++;
			}else if(diceNum == 2) {
				diceCount[1]++;
			}else if(diceNum == 3) {
				diceCount[2]++;
			}else if(diceNum == 4) {
				diceCount[3]++;
			}else if(diceNum == 5) {
				diceCount[4]++;
			}else {
				diceCount[5]++;
			}
		}*/
		
		for (int i = 0; i < 10000; i++) { //선생님이 하신 코드
			diceCount[random.nextInt(6)]++;
		}
			
			System.out.println("-----------");
			System.out.println("면     빈도");
			System.out.println("-----------");
			int sum=0;
			for (int j = 0; j <= 5; j++) {
				System.out.println( (j+1) + "      " +diceCount[j]);
				sum += diceCount[j];
			}
	}
}
