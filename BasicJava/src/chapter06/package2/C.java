package chapter06.package2;
//A와 다른 패키지
import chapter06.package1.A;

public class C {
	public C() {
		A a1 = new A(true);
		//A a2 = new A(1);//default생성자 접근 불가
		//A a3 = new A("문자열");//private생성자 접근 불가
	
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;//default필드 접근 불가
		//a.field3 = 1;//private필드 접근 불가
		
		a.method1();
		//a.method2();//default메소드 접근 불가
		//a.method3();//private메소드 접근 불가
	}
}
