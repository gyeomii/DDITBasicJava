package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member("김성겸", "kimsg", "0001", 26);
		Member member2 = new Member("겸성김", "gyeomsk", "0002", 62);

		System.out.println("이름: " + member1.name);
		System.out.println("아이디: " + member1.id);
		System.out.println("패스워드: " + member1.password);
		System.out.println("나이: " + member1.age);
		System.out.println();
		System.out.println("이름: " + member2.name);
		System.out.println("아이디: " + member2.id);
		System.out.println("패스워드: " + member2.password);
		System.out.println("나이: " + member2.age);
	}
}
