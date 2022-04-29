package chaptor06Example;

public class Circle {
	double radius;
	double x;
	double y;
	
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
	
	public double setRadius(double radius) {
		if(radius <0) { //만약 잘못된 값이 입력되면 반지름을 0으로 한다.
			this.radius = 0;
			return 0 ;
		}else {
			this.radius = radius;
		}
		return radius;
	}
	
	public double setX(double x) {
		this.x = x;
		return x;
	}
	
	public double setY(double y) {
		this.y = y;
		return y;
	}
	

}
