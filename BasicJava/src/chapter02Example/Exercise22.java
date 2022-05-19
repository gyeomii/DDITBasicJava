package chapter02Example;

public class Exercise22 {
	public static void main(String[] args) {
		
		//지구에서 프록시마까지 빛의 속도로 몇 광년이 걸리는지 구해보자
		
		double Distance = 40e12;
		double LightSpeed = 3e5;
		
		//처리(data processing)
		double LightSpeedPerYear = LightSpeed * 60 * 60 * 24 * 365;
		double time = (Distance / LightSpeedPerYear);
		
		//출력(output)
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다");
	}
}
