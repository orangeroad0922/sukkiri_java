package sukkiri_java.chapter4.q4_4;

import java.util.Scanner;

public class HitNumber2 {

	public static void main(String[] args) {

		// 追加課題
		// 数字入力時に数値以外の値を入れたらどうなるか？
		// その対策は？

		int[] numbers = new int[] {3, 4, 9};

		System.out.println("1桁の数字を入力してください");
		int input = new Scanner(System.in).nextInt();

		for (int number : numbers) {
			if (number == input) {
				System.out.println("アタリ！");
			}
		}
	}

}
