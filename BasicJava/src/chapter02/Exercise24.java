package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		//원기둥의 밑면의 넓이와 부피를 구해보자
		Scanner scanner =  new Scanner(System.in);
		double radius;
		double height;
		double area;
		double volume;
		double pi =  Math.PI;
		
		//input
		System.out.print("원기둥 밑면의 반지름을 입력하시오.(단위 : cm): ");
		radius = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		height = scanner.nextDouble();
		
		//data processing
		area = radius * radius * pi;
		volume = area * height;
		
		//output
		System.out.println("원기둥 밑면의 넓이는 " + area + "㎠이고," + "원기둥의 부피는 " + volume + "㎤이다.");
		
	}
}
