package chapter05;

import java.util.Random;

public class newLotto {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lottoNum = new int[45];
		
		for (int i = 0; i < lottoNum.length; i++) { //배열에 1 ~ 45저장
			lottoNum[i] = i+1;
		}
		
	     for (int i = lottoNum.length - 1; i >= 0; i--) { //배열값 섞기
             
	            int j = random.nextInt(i+1);
	             
	            int temp = lottoNum[i];
	            lottoNum[i] = lottoNum[j];
	            lottoNum[j] = temp;
	     }	
	     
	     System.out.print("로또번호: ");
	     for (int j = 0; j < 6; j++) {
	    	 System.out.print(lottoNum[j] + " ");
		}
	}
}
