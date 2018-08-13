package sukkiri_java.chapter2.q2_3;

import java.util.Random;

public class FortuneTelling {

	public static void main(String[] args) {

		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");

		// 名前入力
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.println("あなたの年齢を入力してください");

		// 年齢入力
		String ageString = new java.util.Scanner(System.in).nextLine();

		int age = Integer.parseInt(ageString);

		int fortune = new Random().nextInt(4);

		fortune++;

		System.out.println("占いの結果が出ました！");

		System.out.println(ageString +"歳の" +name +"さん、あなたの運気番号は" +fortune +"です");

		System.out.println("1:大吉、2:忠吉、3:吉、4:凶");
	}

}