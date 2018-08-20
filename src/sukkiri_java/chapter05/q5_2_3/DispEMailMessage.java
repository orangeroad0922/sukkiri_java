package sukkiri_java.chapter05.q5_2_3;

public class DispEMailMessage {

	public static void main(String[] args) {
		email("タイトル", "test1@test.com", "本文１");
		email("test2@test.com", "本文２");
	}

	/**
	 * タイトル、アドレス、本文からEメール送信完了文章を返却する<br>
	 *
	 * @param title
	 * @param address
	 * @param text
	 */
	static void email(String title, String address, String text) {
		System.out.println("「" + address +"」に、以下のメールを送信しました");
		System.out.println("件名：「" +title +"」");
		System.out.println("本文：「" +text +"」");
	}

	/**
	 * アドレス、本文からEメール送信完了文章を返却する<br>
	 * タイトルは「無題」固定<br>
	 *
	 * @param address
	 * @param text
	 */
	static void email(String address, String text) {
		System.out.println("「" + address +"」に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：「" +text +"」");
	}
}
