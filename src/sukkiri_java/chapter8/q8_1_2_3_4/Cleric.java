package sukkiri_java.chapter8.q8_1_2_3_4;

import java.util.Random;

public class Cleric {

	String name = "クレリック";
	int hp = 50;
	int mp = 10;
	final int MAX_HP = 50;
	final int MAX_MP = 10;

	/**
	 * 体力を最大HPまで回復する<br>
	 */
	public void selfAid() {

		this.mp = this.mp - 5;
		this.hp = this.MAX_HP;
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

		if (mp > MAX_MP) {
			mp = MAX_MP;
		}

		return mp - orgMp;
	}
}
