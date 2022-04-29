package chaptor06Example;

public class NewCar {
	//필드
	private double speed;
	private String color;
	static final double MAX_SPEED = 200.0;
	static double distance;
	//생성자
	public NewCar() {
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	//메소드
	public double getSpeed() {
		double mileSpeed = killoToMile(speed);
		double kiloSpeed = mileToKilo(mileSpeed);
		return kiloSpeed;
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
		double mileSpeed = killoToMile(speed);
		double maxMileSpeed = killoToMile(MAX_SPEED);

		if(mileSpeed > maxMileSpeed ) {
			this.speed = this.speed;
			return false;
		}else if(mileSpeed < 0) {
			this.speed = 0;
			return false;
		}else {
			this.speed += speed;
			return true;
		}
	}
	
	static double getMaxSpeed() {
		double maxMileSpeed = killoToMile(MAX_SPEED);
		double maxKilospeed = mileToKilo(maxMileSpeed);
		return maxKilospeed;
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
