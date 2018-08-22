package sukkiri_java.chapter13;

public class Polymorphism {

	public static void main(String[] args) {

		X obj = new A();

		// 13-2-①インタフェースXで定義されているa()は実行可能
		obj.a();

		// 13-2-①インタフェースXで定義されていないb()、c()は実行不可能
		// obj.b();
		// obj.c();

		// 13-2-②y1はAのインスタンスなのでA.a()が、y2はBのインスタンスなのでB.a()がそれぞれ実行される
		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();

		// 13-3
		// 配列はAとBの共通親クラスであるYで定義
		Y[] yarr = new Y[] { new A(), new B() };

		// ループで取り出しb()を実行
		for (Y y : yarr) {
			y.b();
		}
	}
}
