package chapter07_1;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override // 상속한 Airplane클래스의 fly()메소드를 재정의(오버라이드)
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}
