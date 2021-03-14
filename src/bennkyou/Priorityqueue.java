package bennkyou;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		PriorityQueue<String> Hiragana = new PriorityQueue<String>(Comparator.reverseOrder());

		Hiragana.add("あいうえお");
		Hiragana.add("なにぬねの");
		Hiragana.add("かきくけこ");

		System.out.println(Hiragana.poll());
		System.out.println(Hiragana.poll());
		System.out.println(Hiragana.poll());
	}
}
