package chapter07Example.Shape;

public class Rectangle extends Shape {
	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 메소드
	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레: %.1fcm, 넓이: %.1f㎠", perimeter(), area());
	}
}
