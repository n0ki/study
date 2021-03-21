package sevens;

/**
 * トランプのカードを表すクラス
 * @author kusunoki
 *
 */

public class Card {
	/**
	 * ♠スペード♠を表す定数
	 */
	public static final int SuitSpade = 1;
	/**
	 * ♦ダイヤ♦を表す定数
	 */
	public static final int SuitDiamond = 2;
	/**
	 * ♣クラブ♣を表す定数
	 */
	public static final int SuitClub = 3;
	/**
	 * ♥ハート♥を表す定数
	 */
	public static final int SuitHeart = 4;
	/**
	 * スートの数
	 */
	public static final int SuitNum = 4;
	/**
	 * トランプの数字の数
	 */
	public static final int CardNum = 13;

	/**
	 * カードのスート
	 */
	protected int suit;
	/**
	 * カードの数字
	 */
	protected int num;

	/**
	 * スートと数字を指定して新しいカードのインスタンスを作成する。
	 * スートはSuitSpade、SuitDiamond、SuitClub、SuitHeartのうちどれかを指定。
	 * @param suit	スート
	 * @param num	数字
	 */
	public Card(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}

	/*
	 * 数字を見る
	 */
	public int getNum() {
		return num;
	}

	/*
	 * スートを見る
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * カードを文字列で表現する
	 *
	 * @return カードの文字表現
	 */
	public String toString() {
		StringBuffer string = new StringBuffer();

		//スートの表示
		if (suit == SuitSpade) {
			string.append("S");
		} else if (suit == SuitDiamond) {
			string.append("D");
		} else if (suit == SuitClub) {
			string.append("C");
		} else {
			string.append("H");
		}

		//数字の表示
		if (num == 1) {
			string.append("A");
		} else if (num == 10) {
			string.append("X");
		} else if (num == 11) {
			string.append("J");
		} else if (num == 12) {
			string.append("Q");
		} else if (num == 13) {
			string.append("K");
		} else {
			string.append(num);
		}
		return string.toString();
	}
}
