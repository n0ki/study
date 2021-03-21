package sevens;

/**
 * プレイヤーを表すクラス
 * @author kusunoki
 *
 */
public class Player {
	/*
	 * パスした回数
	 */
	private int pass;

	/*
	 * 名前
	 */
	protected String name;

	/*
	 * フィールド
	 */
	protected Table table;

	/*
	 * 手札
	 */
	protected Hand myHand = new Hand();

	/*
	 * 進行役
	 */
	protected Master master;

	/*
	 * ルール
	 */
	protected Rule rule;

	/**
	 * コンストラクタ
	 * @param name		名前
	 * @param master	進行役
	 * @param table		テーブル
	 * @param rule		ルール
	 */
	public Player(String name, Master master, Table table, Rule rule) {
		this.name = name;
		this.master = master;
		this.table = table;
		this.rule = rule;
	}

	/**
	 * 順番を指名する
	 * @param nextPlayer	次のプレイヤー
	 */
	public void play(Player nextPlayer) {
		System.out.println(" " + myHand);

		Card[] candidate = rule.findCandidate(myHand, table);

		if (candidate != null) {
			System.out.println(" " + candidate[0] + "を置きました。\n");
			table.putCard(candidate);
			System.out.println(table);
			if (myHand.getNumOfCards() == 0) {
				master.declareWin(this);
			}
		} else {
			pass++;
			((Master) master).pass(this);

			if (pass > Master.passLimit) {
				int numOfHand = myHand.getNumOfCards();
				for (int count = 0; count < numOfHand; count++) {
					table.putCard(new Card[] { myHand.pickCard(0) });
				}
			}
		}
	}

	/**
	 * 配られたカードを受け取る
	 * @param card	受け取ったカード
	 */
	public void receiveCard(Card card) {

		//配られたカードが7の場合、テーブルにカードを置く
		if (card.getNum() == 7) {
			System.out.println(name + "：" + card + "を置きました");
			table.putCard(new Card[] { card });
		} else {
			//カードが7じゃない場合、手札に加える
			myHand.addCard(card);
		}

	}

	/**
	 * パスした回数を数える
	 * @return	パスした回数
	 */
	public int getPass() {
		return pass;
	}

	/**
	 * プレイヤーの名前をかえす
	 * @return	プレイヤーの名前
	 */
	public String toString() {
		return name;
	}

}
