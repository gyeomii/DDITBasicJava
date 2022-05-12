package chapter11;

import java.lang.reflect.Field;

public class ClassExmaple {
	public static void main(String[] args) throws Exception {
		try {
			Class clazz1 = Class.forName("chapter08Example.bank08.Bank");
			
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.isInterface());

			System.out.println("메소드 갯수: " + clazz1.getMethods().length);
			System.out.println("필드 갯수: " + clazz1.getDeclaredFields().length);
			Field[] df = clazz1.getDeclaredFields();
			for (Field field : df) {
				System.out.println(field.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
