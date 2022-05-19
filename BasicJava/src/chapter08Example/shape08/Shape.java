package chapter08Example.shape08;

public abstract class Shape implements Comparable<Shape> {
	String name;
	// 메소드
	public abstract double area();

	public abstract double perimeter();
	
	@Override
	public int compareTo(Shape o) {
		if (area() > o.area()) {
			return 1;
		} else if (area() < o.area()) {
			return -1;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return String.format("도형의 종류: %s, 둘레: %.2fcm, 넓이: %.2f㎠", name, perimeter(), area());
	}
}
