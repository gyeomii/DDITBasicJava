package chapter06;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private int age = 0;
	private String name = " ";
	
	private Singleton() {}
	
	static String getName(String name) {
		return name;
	}
	
	static int getAge(int age) {
		return age;
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
