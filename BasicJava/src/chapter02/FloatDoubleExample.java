package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		
		//정수 기본형은 int 실수 기본형은 double
		
		float var1 = 3.14f;
		double var2 = 3.14;
		double var3 = 3e6;
		//System.out.println(var3);
		
		double a = 0;
		
		int i =0;
		for(i = 0; i < 1000; i++) {
			a += 0.1;
		}
		System.out.println(a);
		
		double v2 = 1e2; //->int로 지수표현 X 
		System.out.println(v2);

		
		
	}
}
