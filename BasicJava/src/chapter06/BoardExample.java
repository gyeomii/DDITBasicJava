package chapter06;

public class BoardExample {
	public static void main(String[] args) {
		Board b1 = new Board("제목0", "내용0");
		System.out.printf("%s %s %s %s %d\n",b1.title, b1.content, b1.writer, b1.date, b1.hitcount);
		Board b2 = new Board("제목1", "내용1", "저자1");
		System.out.printf("%s %s %s %s %d\n",b2.title, b2.content, b2.writer, b2.date, b2.hitcount);
		Board b3 = new Board("제목2", "내용2", "저자2", "날짜2");
		Board b4 = new Board("제목4", "내용4", "저자4", "날짜4", 4);

	}
}