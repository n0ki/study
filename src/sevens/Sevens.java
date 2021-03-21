package sevens;

public class Sevens {
	public static void main(String args[]) {
		Master master = new Master();
		Table table = new Table();
		Rule rule = new Rule();

		Player player1 = new Player("プレイヤー1", master, table, rule);
		Player player2 = new Player("プレイヤー2", master, table, rule);
		Player player3 = new Player("プレイヤー3", master, table, rule);
		Player player4 = new Player("プレイヤー4", master, table, rule);

		master.registerPlayer(player1);
		master.registerPlayer(player2);
		master.registerPlayer(player3);
		master.registerPlayer(player4);

		Hand trump = createTrump();

		master.prepareGame(trump);

		master.startGmae();
	}

	private static Hand createTrump() {
		Hand trump = new Hand();

		for (int number = 1; number <= Card.CardNum; number++) {
			trump.addCard(new Card(Card.SuitSpade, number));
			trump.addCard(new Card(Card.SuitDiamond, number));
			trump.addCard(new Card(Card.SuitClub, number));
			trump.addCard(new Card(Card.SuitHeart, number));

		}

		return trump;
	}

}
