package sevens;

import java.util.ArrayList;

/**
 *進行役のクラス
 * @author kusunoki
 *
 */

public class Master {
	/**
	 * パスできる回数の制限
	 */
	public static final int passLimit = 3;

	/**
	 * プレイヤーのリスト
	 */
	private ArrayList players = new ArrayList();

	/**
	 * ゲームの準備をする
	 * @param cards	トランプを進行役として配る
	 */
	public void prepareGame(Hand cards) {
		System.out.println("【カードを配ります】");

		//トランプをシャッフルする
		cards.shuffle();

		//トランプの枚数を取得する
		int numOfCards = cards.getNumOfCards();

		//プレイヤーの人数を取得する
		int numOfPlayers = players.size();

		for (int index = 0; index < numOfCards; index++) {
			//カードから1枚引く
			Card card = cards.pickCard(0);

			//各プレイヤーに順番にカードを配る
			Player player = (Player) players.get(index % numOfPlayers);
			player.receiveCard(card);
		}

	}

	/**
	 * ゲームを開始する
	 */
	public void startGmae() {
		System.out.println("【ゲームを開始します】");

		//プレイヤーの人数の取得
		for (int count = 0; players.size() > 1; count++) {
			int playerIndex = count % players.size();
			int nextPlayerIndex = (count + 1) % players.size();

			//指名するプレイヤーの取得
			Player player = (Player) players.get(playerIndex);
			//次のプレイヤーの取得
			Player nextPlayer = (Player) players.get(nextPlayerIndex);
			//プレイヤーを指名する
			System.out.println("\n" + player + "さんの番です");
			player.play(nextPlayer);
		}
		//プレイヤーが上がって残り1名になるとループを抜ける
		System.out.println("【ゲームが終了しました】");
	}

	/**
	 * ゲームの上りを宣言する
	 * @param winner	上がったプレイヤー
	 */
	public void declareWin(Player winner) {
		//上がったプレイヤー
		System.out.println(" " + winner + "さんは上がりました！！");
		//上がったプレイヤーをリストから削除する
		deregisterPlayer(winner);
	}

	/**
	 * ゲームに参加するプレイヤーを登録する
	 * @param player	参加するプレイヤー
	 */
	public void registerPlayer(Player player) {
		players.add(player);
	}

	/**
	 * ゲームに参加するプレイヤーを登録から削除する
	 * (上がったプレイヤーをゲームから抜くときに使う)
	 * @param player	削除するプレイヤー
	 */
	public void deregisterPlayer(Player player) {
		players.remove(players.indexOf(player));

		//残りプレイヤーが1人になったときは敗者を表示する
		if (players.size() == 1) {
			Player loser = (Player) players.get(0);
			System.out.println(" " + loser + "さんの負けです。");
		}
	}

	/**
	 * パスを宣言する
	 * @param player	パスをするプレイヤー
	 */
	public void pass(Player player) {
		//パスの表示
		System.out.println(" " + player + "さんは" + player.getPass() + "回目のパスをしました！");

		//パスの回数が制限を超えていると負けになる
		if (player.getPass() > passLimit) {
			System.out.println(" " + player + "さんは負けです。");
			deregisterPlayer(player);
		}
	}
}
