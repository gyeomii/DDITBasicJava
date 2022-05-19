package chapter10;


public class ExceptionExample {
	public static void main(String[] args) {
		try {
			// 1. 일반 예외(Compiletime Exception)
			Class.forName("java.lang.String1");
			// 2. 실행 예외(Runtime Exception)
			
			int[] numbers = new int[5];
			numbers[10] = 100;
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 없음");
		} catch (Exception e) {
			System.err.println("배열 갯수가 잘못되었습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}
}
