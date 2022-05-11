package chapter10;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(data1 + " + " + data2 + " = " + value1 + value2);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 발생");
		}finally {
			System.out.println("다시 실행하세요");
		}
	}
}
