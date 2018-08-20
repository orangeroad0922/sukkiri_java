package sukkiri_java.chapter10;

public class Wizard {

	// ①フィールドには private を設定し隠蔽
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	// ①メソッドには public を設定し公開
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * wand.getPower());

		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" +recovPoint + "回復した！");
	}

	// ②setter / getter
	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {

		// ③魔法使いのHPが負の値の場合は0
		this.hp = hp >= 0 ? hp : 0;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {

		// ③魔法使いのMPは0以上でなければNG
		if (mp < 0) {
			throw new IllegalArgumentException("MPは0以上でなければいけません。");
		}
		this.mp = mp;
	}

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

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {

		// ③nullはNG
		if (wand == null) {
			throw new IllegalArgumentException("杖が設定されていません。");
		}
		this.wand = wand;
	}
}
