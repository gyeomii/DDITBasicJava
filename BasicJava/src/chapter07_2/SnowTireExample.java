package chapter07_2;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire2 tire2 = snowTire;
		snowTire.run();
		tire2.run();
		
		//부모클래스의 run메소드가
		//자식클래스의 run메소드에 의해 오버라이드 되어서
		//자식의 run메소드로 출려된다.
	}
}
