package chapter08Example.shape08;

public class Rectangle extends Shape {
	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		name = "사각형";
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
}
