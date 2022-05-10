package dditMidterm;

import java.util.List;

public class MyUtils {
	public static double avg(List<Integer> scores) {
		return scores.stream().mapToInt(Integer::intValue).average().getAsDouble();
	}

	public long count(List<Integer> scores) {
		return scores.stream().mapToInt(Integer::intValue).count();
	}
}
