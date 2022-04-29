package chaptor06Example;

public class Circle {
	//필드
	double radius;
	double x;
	double y;
	//메소드
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
		if(radius <0) { //만약 잘못된 값이 입력되면 반지름을 0으로 한다.
			this.radius = 0;
		}else {
			this.radius = radius;
		}
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	

}
