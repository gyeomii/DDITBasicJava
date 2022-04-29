package chaptor06Example;

public class Car {
	//필드
	private double speed;
	private String color;
	static final double MAX_SPEED = 200.0;
	//생성자
	public Car() {
	}
	
	public Car(String color) {
		this.color = color;
	}
	//메소드
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		if(speed > MAX_SPEED ) {
			this.speed = this.speed;
			return false;
		}else if(speed < 0) {
			this.speed = 0;
			return false;
		}else {
			this.speed += speed;
			return true;
		}
	}
	
	static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	public String toString() {
		return String.format("%d", speed);
	}
	
}
