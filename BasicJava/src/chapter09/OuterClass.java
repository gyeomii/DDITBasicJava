package chapter09;

public class OuterClass {
	static String outerName;
	static void outerMethod() {
		System.out.println("outer method called");
	}
	static class InnerClass{
		String innerName;
		void innerMethod() {
			System.out.println("inner method called");
		}
	}
}
