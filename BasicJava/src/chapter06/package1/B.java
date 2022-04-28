package chapter06.package1;
//A와 같은 패키지
public class B {
	public B() {
		A a1 = new A(true);
		A a2 = new A(1);
		A a3 = new A("문자열"); //private생성자 접근 불가
	
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;//private필드 접근 불가

		a.method1();
		a.method2();
		a.method3();//private메소드 접근 불가
	}
	
}