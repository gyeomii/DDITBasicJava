package chapter03;

import java.util.Scanner;

public class Example11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ID: ");
		String id = scanner.nextLine();
		
		if(id.equals("java")) {
			
			System.out.print("P/W: ");
			String strPW = scanner.nextLine();
			int pw = Integer.parseInt(strPW);
			
			if(pw == 12345) {
				System.out.println("Login Succeed");
			}
			else {
				System.out.println("Login Failed: Wrong Password");
			}
		}
		else {
			System.out.println("Login Falied: ID isn't exist");
		}
	}
}
