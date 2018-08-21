package sukkiri_java.chapter11;

import sukkiri_java.chapter10.Hero;

/**
 * ア. お化けキノコの中でも毒攻撃ができる「お化け毒キノコ」クラス<br>
 */
public class PoisonMatango extends Matango {

	// ウ. 毒を用いた攻撃が可能な残り回数
	private int poisonAttackCnt = 5;

	/**
	 * イ. コンストラクタ<br>
	 * 親クラスをそのまま呼び出す<br>
	 *
	 * @param suffix
	 */
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	/**
	 * エ. 通常のお化けキノコ同様の攻撃＋独自の攻撃<br>
	 */
	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonAttackCnt > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.getHp() / 5;
			h.setHp(h.getHp() - damage);
			System.out.println(damage + "ポイントのダメージ");
			this.poisonAttackCnt--;
		}
	}

}
