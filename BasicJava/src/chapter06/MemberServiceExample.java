package chapter06;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService  memberService = new MemberService();
		String id = " ";
		String pw = " ";
		
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
