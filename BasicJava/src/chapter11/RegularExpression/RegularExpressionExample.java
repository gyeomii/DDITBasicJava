package chapter11.RegularExpression;

public class RegularExpressionExample {
	public static void main(String[] args) {
		System.out.println("Java");
		System.out.println("Java Programming");
		System.out.print("Java");
		System.out.println("Java Programming");
		System.out.print("Java");
		System.out.println("Java 프로그래밍 Java");
		System.out.print("Java");
		System.out.println("Java Programming");
		System.out.println("Java Java Java Java");
		System.out.print("자바 프로그래밍");
		System.out.println("Java Java");
		System.out.println("Java Programming");
	}
}
// \.println\(\"[jJ]ava\ ?([jJ]ava)? -> /printf\(\"자바