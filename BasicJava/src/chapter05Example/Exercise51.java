package chapter05Example;

public class Exercise51 {
	public static void main(String[] args) {
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		//int max = array[0];//0번째 인덱스가 없으면 오류
		//int min = array[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) { //최대
				max = array[i];
			}else if(min > array[i]) { //최소
				min = array[i];
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}