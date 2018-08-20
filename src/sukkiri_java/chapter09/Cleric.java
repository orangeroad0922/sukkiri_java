package sukkiri_java.chapter09;

import java.util.Random;

public class Cleric {

	String name = "クレリック";
	int hp = 50;
	int mp = 10;

	// ①最大HP、最大MPはクラス変数とする
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;

	/**
	 * ②-A)コンストラクタ（名前、HP、MP指定）
	 *
	 * @param name 名前
	 * @param hp 初期HP
	 * @param mp 初期MP
	 */
	Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	/**
	 * ②-B)コンストラクタ（名前、HP）<br>
	 * MPは最大MPが初期値となる<br>
	 *
	 * @param name 名前
	 * @param hp HP
	 */
	Cleric(String name, int hp) {
		this(name, hp, MAX_MP);
	}

	/**
	 * ②-C)コンストラクタ（名前）<br>
	 * HPは最大HPが、MPは最大MPが初期値となる<br>
	 *
	 * @param name 名前
	 */
	Cleric(String name) {
		this(name, MAX_MP);

		// 以下でも可
		// this(name, MAX_HP, MAX_MP);
	}

	/**
	 * ②-D)引数なしのコンストラクタは用意しない<br>
	 * 名前を指定しない場合にはインスタンス化することはできない<br>
	 */

	/**
	 * 体力を最大HPまで回復する<br>
	 */
	public void selfAid() {

		this.mp = this.mp - 5;

		// ①MAX_HPはstaticなのでthisは付けない
		this.hp = MAX_HP;
		System.out.println("HPが回復した");
	}

	/**
	 * MPを回復する<br>
	 * 回復量は引数の秒数にランダムで0～2を加えた値<br>
	 * 最大MPを超えて回復することはない<br>
	 *
	 * @param second
	 * @return
	 */
	public int pray(int second) {

		int orgMp = mp;
		mp = mp + second + (new Random().nextInt(3));

		// ①MAX_MPはstaticなのでthisは付けない
		if (mp > MAX_MP) {
			mp = MAX_MP;
		}

		return mp - orgMp;
	}
}
