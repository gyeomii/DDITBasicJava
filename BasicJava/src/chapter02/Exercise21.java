package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		
		//직사각형의 넓이와 둘레를 구해보자
		
		double width;
		double height;
		double area;
		double perimeter;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m): ");
		width = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위: m): ");
		height = scanner.nextDouble();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + perimeter);
	}
}
