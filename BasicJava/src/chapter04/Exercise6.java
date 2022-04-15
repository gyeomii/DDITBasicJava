package chapter04;

public class Exercise6 {
	public static void main(String[] args) {
		for(int i = 4; i > 0; i--) {
			for(int j = 1; j < 5; j++) {
				if(i > j) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}System.out.println("");
		}
	}
}
