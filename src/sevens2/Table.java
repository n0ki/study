package sevens2;

import sevens.Card;

/**
 * テーブルを表すクラス
 *
 * @author 	kusunoki
 *
 */
public class Table {

	/**
	 * カードを並べるテーブルを表す2次元配列
	 */
	private Card[][] table = new Card[Card.SuitNum][Card.CardNum];

	/**
	 * テーブルのカードを見る
	 * @return	テーブルに置かれたカードを表す配列
	 */
	public Card[][] getCards() {
		return table;
	}

	public String toString() {
		StringBuilder tableStr = new StringBuilder(200);
		for (int suit = 0; suit < Card.SuitNum; suit++) {
			for (int num = 0; num < Card.CardNum; num++) {
				if (table[suit][num] != null) {
					tableStr.append(table[suit][num]);
					//トランプがないときは..を表示する
				} else {
					tableStr.append("..");
				}
				tableStr.append(" ");
			}
			tableStr.append("\n");
		}
		return tableStr.toString();
	}

}
