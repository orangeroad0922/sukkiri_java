package sukkiri_java.chapter03.q3_5;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");

		int selected = new Scanner(System.in).nextInt();
		String operation = "";

		switch (selected) {
			case 1:
				operation = "検索";
				break;
			case 2:
				operation = "登録";
				break;
			case 3:
				operation = "削除";
				break;
			case 4:
				operation = "変更";
				break;
			default:
				break;
		}

		if (!"".equals(operation)) {
			System.out.println(operation + "します");
		}
	}
}
