package chapter11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1); // Mon May 16 11:13:43 KST 2022
		System.out.println();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		System.out.println();

		// jdk 1.8 이후(2014년 이후)
		String now1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초"));
		System.out.println(now1);
		System.out.println();
		String now2 = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일"));
		System.out.println(now2);
	}
}
