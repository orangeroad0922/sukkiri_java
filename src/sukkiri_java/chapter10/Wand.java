package sukkiri_java.chapter10;

public class Wand {

	// ①フィールドには private を設定し隠蔽
	private String name;
	private double power;

	// ②getter / setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {

		// ③nullはNG、3文字未満はNG
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上でなければいけません。");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {

		// ③増幅率は 0.5以上100.0以下
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("増幅率は0.5以上100.0以下のみ設定可能です。");
		}

		this.power = power;
	}
}
