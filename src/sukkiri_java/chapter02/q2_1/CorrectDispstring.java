package sukkiri_java.chapter02.q2_1;

public class CorrectDispstring {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		// 文字列と並べて + で書くと文字列扱いになってしまう
		// String ans = "x+yは" + x + y;

		// カッコで括ることでカッコ内は数値計算となり
		// 計算結果が文字列扱いとなる
		String ans = "x+yは" + (x + y);

		System.out.println(ans);
	}
}
