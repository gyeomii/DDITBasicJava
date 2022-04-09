package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		long l = 5000000000L;
		float f = l;
		double d = f;
		
		System.out.println(f);
		System.out.println(d);
		
		int i = 200;
		byte b = (byte) i;
		System.out.println(b);
		
		double d2 = 320000000.141592;
		int i2 = (int) d2;
		System.out.println(i2);
		
		float floatValue = 2.5f;
		int intValue = 5;
		float result = intValue + floatValue;
		System.out.println(result);
		
	}
}
