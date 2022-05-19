package chapter08Example.shape08;

public class Circle extends Shape {
	// 필드
	private double radius;
	
	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		name = "원";
	}

	// 메소드
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}

}
