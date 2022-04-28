package chapter06;

import java.util.Scanner;


public class MemberService {
	Scanner scanner = new Scanner(System.in);
	
	String getId(String id) {
		System.out.print("ID: ");
		id = scanner.nextLine();
		return id;
	}
	
	String getPassword(String pw){
		System.out.print("P/W: ");
		pw = scanner.nextLine();
		return pw;
	}
	
	boolean login(String id, String password){
		id = getId(id);
		password = getPassword(password);
		if(id.equals("hong") && password.equals("12345")) {
			return true;	
		}else {
			return false;
		}
	}
	
	void logout(String command) {
		if(command.equals("logout")) {
		System.out.println("로그아웃 되었습니다.");
		}else {
			System.out.println("정확한 command를 입력하세요.");
		}
	}
}
