package chaptor06Example;

public class NewCar {
	//필드
	private double speed;
	private String color;
	static final double MAX_SPEED = 200.0/1.6;

	//생성자
	public NewCar() {
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	//메소드
	public double getSpeed() {
		return mileToKilo(speed);
		
	}
	
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if(speed + this.speed < 0 ) {
			speed = 0;
			return false;
		}else if(speed > MAX_SPEED) {
			return false;
		}else {
			this.speed += speed;
			return true;
		}
	}
	
	static double getMaxSpeed() {
		return mileToKilo(MAX_SPEED);
	}
	
	static private double killoToMile(double distance) {
		double result = distance/1.6;
		return result;
	}
	
	static private double mileToKilo(double distance) {
		double result = distance * 1.6;
		return result;
	}
	
	public String toString() {
		return String.format("%d", speed);
	}
}
