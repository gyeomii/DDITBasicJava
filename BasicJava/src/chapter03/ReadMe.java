package chapter03;

public class ReadMe {
	public static void main(String[] args) {
		
	//Summary 22.04.12
	/*
	 * 프로그래밍 : 데이터 [ 변수, 연산자, 제어문, 메소드]
	 * 	변수 : 선언, 초기화									  
	 * 	연산자 : 산술, 부호, 문자열, 대입, 증감, 비교, 논리, 조건                                   
	 * 	제어문 : 반복문, 조건문									
	 * 	메소드										      
	 * 
	 *  - 자바 연산자 : 기본타입만 연산 가능
	 *  
	 *  대입연산자의 우선순위가 연산자중에 가장 낮다.
	 */
	int b = 5;
	double c = 15 % 3.4176;
	
	System.out.printf("%d, %d\n", ++b, b );
	System.out.printf("%f, %f", c++, c );
	
	}
}
