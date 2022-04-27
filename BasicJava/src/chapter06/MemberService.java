package chapter06;

public class MemberService {
	
	boolean login(String id, String password){
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
