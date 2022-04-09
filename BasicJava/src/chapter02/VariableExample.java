package chapter02;

public class VariableExample {
	public static void main(String[] args) {
		
		
		byte a = 127;
		char b  = 'B';
		String str = "gyeom";
		short c = 32767;
		int d = 2147483647;
		long e = 5000000000L;
		float f = 3.141456213246565f;
		double g = 3527.6543265465876879654654;
		boolean h = true;
		int[] scores = { 80, 79, 56 };
		
		char var1 = 'A';
		char var2 = 65;
		char var3 = 0x0041;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		for( int i=0; i<3; i++) {
			System.out.println(scores[i]);
		}
		
		
	}
}
// ctrl + space