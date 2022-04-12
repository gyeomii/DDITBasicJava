package chapter03;

public class LogicalOperatorExample {
	 public static void main(String[] args) {
		 
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}
		
		if((charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		/*
		 *  &&와 & 둘다 같은 기능을 하지만 
		 *  &&는 앞의 피연산자가 false라면 뒤의 피연산자는 계산하지않고 false라는 결론을 낸다.
		 *  &는 앞의 피연산자가 false여도 앞, 뒤 피연산자 모두 계산한 후에 결론을 낸다.
		 *  
		 *  || 와 | 도 동일하다. 앞의 피연산자가 true면 뒤의 피연산자를 계산하지 않아도 true기 때문에 true라는 결론을 낸다.
		 *  
		 *  따라서 && 와 || 가 더 효율적으로 동작한다.
		 */
		
	}
}
