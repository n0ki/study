package sevens;

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
	 * カードを置く
	 * @param card
	 */
	public void putCard(Card[] card) {
		int num = card[0].getNum();
		int suit = card[0].getSuit();

		//テーブルにカードを置く
		table[suit - 1][num - 1] = card[0];
	}

	/**
	 * テーブルのカードを見る
	 * @return	テーブルに置かれたカードを表す配列
	 */
	public Card[][] getCards() {
		return table;
	}

	public String toString() {
		StringBuffer tableString = new StringBuffer(200);
		for (int suit = 0; suit < Card.SuitNum; suit++) {
			for (int num = 0; num < Card.CardNum; num++) {
				if (table[suit][num] != null) {
					tableString.append(table[suit][num]);
					//トランプがないときは..を表示する
				} else {
					tableString.append("..");
				}
				tableString.append(" ");
			}
			tableString.append("\n");
		}
		return tableString.toString();
	}

}
