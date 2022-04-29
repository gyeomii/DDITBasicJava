package chapter06;

public class Car {
	
	//외부에서 객체의 필드를 직접 접근하는것을 막기위해 private로 선언
	private int speed;
	private boolean stop;
	
	//메소드를 통해서 필드를 변경
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
