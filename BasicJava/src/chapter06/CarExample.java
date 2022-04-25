package chapter06;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.println("제작회사: " + car1.company);
		System.out.println("모델명: " + car1.model);
		System.out.println("색: " + car1.color);
		System.out.println("최고속도: " + car1.maxSpeed);
		System.out.println("엔진상태: " + car1.engineStart);
		System.out.println("현재속도: " + car1.speed);
		
		car1.engineStart = true;
		car1.speed = 60;
		System.out.println("수정된 엔진상태: " + car1.engineStart);
		System.out.println("수정된 속도: " + car1.speed);
	}
}
