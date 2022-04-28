package chapter06;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		int obj1Age = obj1.getAge(26);
		String obj1Name = obj1.getName("김성겸");
		
		System.out.println(obj1Name);
		System.out.println(obj1Age);
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
