package midtermExam;

import java.util.Arrays;
import java.util.List;

public class MethodTest {
	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(49, 26, 37, 98, 93, 85, 76, 83, 94, 100, 67, 75, 88, 91, 79, 67);
		// avg 메소드를 호출하여 콘솔에 평균을 출력하시오 
		System.out.println(MyUtils.avg(scores));
		// count 메소드를 호출하여 콘솔에 총 갯수를 출력하시오 
		MyUtils utils = new MyUtils();
		System.out.println(utils.count(scores));
	}
}
