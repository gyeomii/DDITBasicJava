package chapter05;

public class nullExample {
	public static void main(String[] args) {
		//String str1 = new String(null);
		String str1 = null;
		String str2 = "";
		String a[] = {null, null, null, null};
		
		str1 += 10;
		str2 += 10;
		
		System.out.println(str1);
		System.out.println(str2);
		
		for(int i = 0; i < 4; i++ ) {
			System.out.printf("a[%d] = " + (a[i]+i) +"\n", i);
			}
		
		str2 = null;
		System.out.println(str2);
		System.out.println(str1 == str2);
	}
}
