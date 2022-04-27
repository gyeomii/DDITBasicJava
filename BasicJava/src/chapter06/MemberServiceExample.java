package chapter06;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService  memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ID: ");
		String id = scanner.nextLine();
		System.out.print("P/W: ");
		String pw = scanner.nextLine();
		boolean result = memberService.login(id, pw);
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			System.out.print("command: ");
			String command = scanner.nextLine();
			memberService.logout(command);
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
