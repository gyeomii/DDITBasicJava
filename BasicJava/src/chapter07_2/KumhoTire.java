package chapter07_2;

public class KumhoTire extends Tire {
	// 필드
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " KumhoTire 평크 ***");
			return false;
		}
	}
}
