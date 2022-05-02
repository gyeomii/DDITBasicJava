package chaptor06Example;

public class Circle {
	// 필드
	private double radius;
	private double x;
	private double y;

	// 생성자
	public Circle() {

	}

	// 메소드
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setRadius(double radius) {
		if (radius > 0) { // 반지름이 0보다 클 때만 반지름을 입력받고
			this.radius = radius; //0보다 작거나 같을 땐 처음 초기화된 값 0 으로 실행
		}
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

}
