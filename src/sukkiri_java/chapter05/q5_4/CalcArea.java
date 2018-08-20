package sukkiri_java.chapter05.q5_4;

public class CalcArea {

	public static void main(String[] args) {

		System.out.println(calcTriangleArea(3, 4));
		System.out.println(calcCircleArea(5));
	}

	/**
	 * 三角形の面積を返却する<br>
	 * （底辺×高さ）÷2<br>
	 *
	 * @param bottom
	 * @param height
	 * @return
	 */
	public static double calcTriangleArea(double bottom, double height) {
		return (bottom * height) / 2;
	}

	/**
	 * 円の面積を返却する<br>
	 * 半径×半径×π<br>
	 *
	 * @param radius
	 * @return
	 */
	public static double calcCircleArea(double radius) {
		return radius * radius * Math.PI;
	}
}
