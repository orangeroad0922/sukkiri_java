package sukkiri_java.chapter3.q3_1;

public class ExpressCondition {

	public static void main(String[] args) {

		int weight = 60;
		if (weight == 60) {
			System.out.println("①変数weightの値が60に等しい。");
		}

		int age1 = 20;
		int age2 = 25;
		if ((age1 + age2) * 2 > 60) {
			System.out.println("②変数age1とage2の合計を2倍したものが60を超えている。");
		}

		int age = 5;
		if (age % 2 == 1) {
			System.out.println("③変数ageが奇数である。");
		}

		String name = "湊";
		if ("湊".equals(name)) {
			System.out.println("④変数nameの中身の文字列が「湊」と等しい。");
		}
	}
}
