package chapter05;

import java.util.Scanner;

public class ArrayExercise06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int i;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for (i = 0; i < scores.length; i++) {
				System.out.print("scores[" + i + "]> ");
				scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for (i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
					}
			}else if(selectNo == 4) {
				for (i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				double avg = (double) sum / studentNum;
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);
			}else if(selectNo == 5) {
				System.out.print("프로그램 종료");
				run = false;
			}
		}
	}
}
