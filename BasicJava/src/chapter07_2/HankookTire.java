package chapter07_2;

public class HankookTire extends Tire {
	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire 평크 ***");
			return false;
		}
	}
}
