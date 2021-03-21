package sevens;

/**
 * 七並べのルールを指定するクラス
 * (どのときにどこにおけるかを指定する)
 * @author kusunoki
 *
 */
public class Rule {
	/**
	 * テーブルにおけるカードを探す
	 * @param hand	手札
	 * @param table	テーブル
	 * @return		見つかったカードの組み合わせ。見つからない場合はnull。
	 */
	public Card[] findCandidate(Hand hand, Table table) {
		//テーブルにおけるカードの候補
		Card[] candidate = null;

		//手札にあるカードを1枚ずつチェック。テーブルにおけるか調べる
		int numOfHand = hand.getNumOfCards();
		for (int position = 0; position < numOfHand; position++) {
			//手札にあるカードを見る
			Card lookingCard = hand.lookCard(position);
			int number = lookingCard.getNum();
			int suit = lookingCard.getSuit();

			//今注目している手札の左か右にカードがあればカードを置ける
			int leftNum = (number != 1) ? number - 1 : Card.CardNum;
			int rightNum = (number != Card.CardNum) ? number + 1 : 1;

			if ((true == isThereCard(table, suit, leftNum))
					|| (true == isThereCard(table, suit, rightNum))) {
				//手札からカードを引いて候補とする
				candidate = new Card[1];
				candidate[0] = hand.pickCard(position);
				break;
			}
		}
		return candidate;
	}

	/**
	 * テーブルにカードが置かれているかを調べる
	 * @param table		テーブル
	 * @param suit		スート
	 * @param number	数字
	 * @return			カードが置かれている場合はtrue
	 */
	private boolean isThereCard(Table table, int suit, int number) {
		//テーブルにあるカードを調べてカードが置かれているのかを調べる
		Card[][] cards = table.getCards();
		if (cards[suit - 1][number - 1] != null) {
			return true;
		} else {
			return false;
		}
	}

}
