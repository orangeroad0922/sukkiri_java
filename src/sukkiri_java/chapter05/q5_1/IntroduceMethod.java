package sukkiri_java.chapter05.q5_1;

public class IntroduceMethod {

	public static void main(String[] args) {
		introduceOneself();
	}

	/**
	 * 名前、年齢、身長、性別からなる自己紹介文言を返却する
	 */
	public static void introduceOneself() {

		String name = "カナメ・バッカニア";
		int age = 22;
		double height = 168.1;
		char sex = '女';

		System.out.println("私の名前は" +name +"です。" +age +"歳（" +sex +"）で身長は" +height +"です" );
	}
}
