package SortExample;

public class AppleFilter {
	public static Apple[] filter(Apple[] apples, ApplePredicate predicate) {
		Apple[] retArr = new Apple[10];
		int i = 0;
		for (Apple apple : apples) {
			if (predicate.test(apple)) {
				retArr[i++] = apple;
			}
		}
		return retArr;
	}
}
