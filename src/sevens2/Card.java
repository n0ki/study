package sevens2;

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
	 * 	このカードの数字の値を返す
	 */
	public int getNum() {
		return num;
	}

	/*
	 * このカードのスートを返す
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
		StringBuilder cardStr = new StringBuilder();

		//スートの表示
		if (suit == SuitSpade) {
			cardStr.append("S");
		} else if (suit == SuitDiamond) {
			cardStr.append("D");
		} else if (suit == SuitClub) {
			cardStr.append("C");
		} else {
			cardStr.append("H");
		}

		//数字の表示
		if (num == 1) {
			cardStr.append("A");
		} else if (num == 10) {
			cardStr.append("X");
		} else if (num == 11) {
			cardStr.append("J");
		} else if (num == 12) {
			cardStr.append("Q");
		} else if (num == 13) {
			cardStr.append("K");
		} else {
			cardStr.append(num);
		}
		return cardStr.toString();
	}
}
