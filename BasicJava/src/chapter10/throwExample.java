package chapter10;

public class throwExample {
	public static void main(String[] args) {
		// throw 명령어
		try {
			throw new Exception("내가 만든 에러"); // 컴파일 에러이기 때문에 try/catch를 해줘야 실행 가능
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		throw new RuntimeException("내가 만든 에러"); // 런타임 에러기 때문에 컴파일 에러가 뜨지 않음
	}
}
