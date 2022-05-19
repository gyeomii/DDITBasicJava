package chapter07_1;

public class Cellphone {
	// 필드
	String model;
	String color;

	// 생성자
	public Cellphone() {
	}

	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void poweroff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("나: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	void hangUP() {
		System.out.println("전화를 끊습니다.");
	}
}
