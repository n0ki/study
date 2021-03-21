package sevens;

import java.util.ArrayList;

/**
 * 手札を表すクラス
 * @author kusunoki
 */

public class Hand {
	/**
	 * 手札にあるカードを保持するためのリスト
	 */
	private ArrayList hand = new ArrayList();

	/**
	 * カードを加える
	 * @param card
	 */
	public void addCard(Card card) {
		//カードを最後に加える
		hand.add(card);
	}

	/**
	 * カードを見る
	 * positionは0からgetNumberOfCard()の範囲で指定する
	 *
	 * @param position	カードの位置
	 * @return	positionで指定された位置のカード。範囲外はnull
	 */

	public Card lookCard(int position) {
		Card lookingCard = null;

		if ((0 <= position) && (position < hand.size())) {
			lookingCard = (Card) hand.get(position);
		}
		return lookingCard;
	}

	/**
	 * カードを引く
	 * 引いたカードは手札から除去
	 * @param position	カードの位置
	 * @return	positionで指定された位置のカード。範囲外はnull
	 */
	public Card pickCard(int position) {
		Card pickCard = null;

		if ((0 <= position) && (position < hand.size())) {
			pickCard = (Card) hand.remove(position);
		}
		return pickCard;
	}

	/**
	 * シャッフルする
	 */
	public void shuffle() {
		int HandNum = hand.size();
		int pos;
		for (int count = 0; count < HandNum * 2; count++) {
			pos = (int) (Math.random() * HandNum);
			Card pickedCard = (Card) hand.remove(pos);
			hand.add(pickedCard);
		}
	}

	/**
	 * 手札の枚数を数える
	 * @return	手札にあるカードの枚数
	 */
	public int getNumOfCards() {
		return hand.size();
	}

	/**
	 * 手札にあるカードを文字列で表現する
	 */
	public String toString() {
		StringBuffer string = new StringBuffer();

		int size = hand.size();
		if (size > 0) {
			for (int index = 0; index < size; index++) {
				Card card = (Card) hand.get(index);
				string.append(card);
				string.append(" ");
			}
		}
		return string.toString();
	}

}
