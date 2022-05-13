package chapter11;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = new Integer(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		
		System.out.println(intData1);
		System.out.println(strData2);
		
	}
}
