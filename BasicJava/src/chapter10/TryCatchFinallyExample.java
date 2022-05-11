package chapter10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과함");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환 불가");
			} finally {
				System.out.println(value);
			}
		}
	}
}
