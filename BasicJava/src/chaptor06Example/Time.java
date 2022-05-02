package chaptor06Example;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;

	// 생성자
	public Time() {
	}

	public Time(int hour, int minute, int second) {
		if (hour > 0 && hour < 24) {
			this.hour = hour;
		}
		if (minute > 0 && minute < 60) {
			this.minute = minute;
		}
		if (second > 0 && second < 60) {
			this.second = second;
		}
	}

	// 메소드
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
