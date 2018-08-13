package sukkiri_java.chapter4.q4_2;

public class AccountBalance {

	public static void main(String[] args) {

		int[] moneyList = new int[] {121902, 8302, 55100};

		// for文
		for (int counter = 0; counter < moneyList.length; counter++) {
			System.out.println(moneyList[counter]);
		}

		// 拡張for文
		for (int money : moneyList) {
			System.out.println(money);
		}
	}
}
