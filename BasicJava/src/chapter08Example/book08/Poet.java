package chapter08Example.book08;

public class Poet extends Book {
	
	public Poet(String title, String author) {
		super(title, author);
	}
	
	@Override
	public int getLateFee(int lateDays) {
		return 200 * lateDays;
	}

}
