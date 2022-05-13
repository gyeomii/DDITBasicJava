package chapter07_3;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override // 추상 메소드 재정의
	public void sound() {
		System.out.println("야옹");
	}
	@Override// 일반 메소드 재정의
	public void breathe() {
		System.out.println("숨을 야옹하고 쉽니다.");
	}
}
