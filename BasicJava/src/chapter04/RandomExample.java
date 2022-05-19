package chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		
			//옛날 랜덤 공식 -> 사용X
			//(int)(Math.random() * (추출할 숫자의 수)) + 처음숫자;
			
			//사용해야 할 랜덤 공식
			Random random = new Random();
			// random.nextInt(추출할 숫자의 수) + 처음숫자;
			int a = random.nextInt(6); // 0 ~ 5까지 난수
			int b  = random.nextInt(6) + 1; //1 ~ 6까지 난수
	}
}