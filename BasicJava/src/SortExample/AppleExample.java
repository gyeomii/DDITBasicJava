package SortExample;

public class AppleExample {
	public static void main(String[] args) {
		Apple[] apples = new Apple[10];
		apples[0] = new Apple("1번사과", Color.RED);
		apples[1] = new Apple("2번사과", Color.GREEN);
		apples[2] = new Apple("3번사과", Color.RED);
		apples[3] = new Apple("4번사과", Color.GREEN);
		apples[4] = new Apple("5번사과", Color.RED);
		apples[5] = new Apple("6번사과", Color.GREEN);
		apples[6] = new Apple("7번사과", Color.YELLOW);
		apples[7] = new Apple("8번사과", Color.RED);
		apples[8] = new Apple("9번사과", Color.RED);
		apples[9] = new Apple("10번사과", Color.YELLOW);
		
		Apple[] filteredApples = AppleFilter.filter(apples, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				return apple.getColor() == Color.YELLOW;
			}
		});
		for (Apple apple : filteredApples) {
			if (apple != null) {
				System.out.println(apple);
			}
		}
	}
}
