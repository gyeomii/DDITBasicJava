package chaptor06Example;

public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("기본 생성자 호출후 시간: " + time1);
		Time time2 = new Time(22, 15, 48);
		System.out.println("두 번째 생성자 호출후 시간: " + time2);
		Time time3 = new Time(15, 66, 77);
		System.out.println("올바르지 않는 시간 설정후 시간: " + time3);
	}
}
