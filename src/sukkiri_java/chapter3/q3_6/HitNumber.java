package sukkiri_java.chapter3.q3_6;

import java.util.Random;
import java.util.Scanner;

public class HitNumber {

	public static void main(String[] args) {

		int ans = new Random().nextInt(10);
		int num = 0;

		System.out.println("【数あてゲーム】");

		for (int counter = 0; counter < 5; counter++) {
			System.out.println("0から9までの数字を入力してください");
			num = new Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}

		System.out.println("答えは" + ans +"でした");
		System.out.println("ゲームを終了します");
	}
}
