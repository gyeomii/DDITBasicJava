package chapter05;

import java.util.Random;

public class NewLotto {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lottoNum = new int[45];
		
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i+1;
		}
		
	     for (int i = lottoNum.length - 1; i >= 0; i--) {
             
	            int j = random.nextInt(i+1);
	             
	            int temp = lottoNum[i];
	            lottoNum[i] = lottoNum[j];
	            lottoNum[j] = temp;
	     }	
	     for (int j = 0; j < 6; j++) {
	    	 System.out.print(lottoNum[j] + " ");
		}
	     
	}
}
