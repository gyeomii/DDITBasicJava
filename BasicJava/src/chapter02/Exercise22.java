package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		double Distance = 40e12;
		double LightSpeed = 3e5;
		double LightSpeedPerYear = LightSpeed * 60 * 60 * 24 * 365;
		double time = (Distance / LightSpeedPerYear);
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다");
	}
}
