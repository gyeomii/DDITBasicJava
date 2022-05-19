package SortExample;

import java.util.Arrays;

public class SortExample2 {
	public static void main(String[] args) {
		Human[] human = new Human[10];
		human[0] = new Human("홍길동", 21);
		human[1] = new Human("이순신", 27);
		human[2] = new Human("류관순", 17);
		human[3] = new Human("신용권", 46);
		human[4] = new Human("아이유", 30);
		human[5] = new Human("박보검", 30);
		human[6] = new Human("기민혁", 27);
		human[7] = new Human("박수현", 20);
		human[8] = new Human("윤재열", 24);
		human[9] = new Human("최재혁", 17);
		Arrays.sort(human);
		for (Human human2 : human) {
			System.out.println(human2);
		}
	}
}
