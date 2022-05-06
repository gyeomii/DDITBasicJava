package chapter07_1;

public class Computer extends Calculator {
	@Override // 상속한 Calculator클래스의 areaCircle()메소드를 재정의(오버라이드)
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
