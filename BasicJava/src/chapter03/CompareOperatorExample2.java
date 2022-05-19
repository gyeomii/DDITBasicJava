package chapter03;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		//double타입에 0.1을 입력하더라도 정확한 0.1이 아닌 double범위내의 근사값이 들어있고
		//float타입도 근사치가 들어있기 때문에 두 값을 비교하면 false가 나온다.
		System.out.println((float)v4 == v5);
	}
}
