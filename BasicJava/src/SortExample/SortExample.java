package SortExample;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("홍길동", 21);
		students[1] = new Student("이순신", 27);
		students[2] = new Student("류관순", 17);
		students[3] = new Student("신용권", 46);
		students[4] = new Student("아이유", 30);
		students[5] = new Student("박보검", 30);
		students[6] = new Student("기민혁", 27);
		students[7] = new Student("박수현", 20);
		students[8] = new Student("윤재열", 24);
		students[9] = new Student("최재혁", 17);
		
		Arrays.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
