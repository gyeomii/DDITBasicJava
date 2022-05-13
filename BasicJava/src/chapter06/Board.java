package chapter06;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	public Board(String title, String content) {
		this(title, content, "저자0", "날짜0", 0);
	}

	public Board(String title, String content, String writer) {
		this(title, content, writer, "날짜1", 1);
	}

	public Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 2);
	}

	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
