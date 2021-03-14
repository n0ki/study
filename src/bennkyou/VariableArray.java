package bennkyou;

import java.util.ArrayList;

public class VariableArray {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("こんにちは");
		array.add("こんばんは");
		array.add("おはよう");

		boolean isContain = array.contains("おはようございます");

		if (isContain) {
			System.out.println("存在します");
		} else {
			System.out.println("存在しません");
		}
		//おはよう、こんにちは、おやすみなさいで出力
		/*array.remove(0);
		array.add("おやすみなさい");*/


		//array.set(2, "おやすみなさい");	←これはindex2をおやすみなさいに変えている

		//こんにちは⇒おやすみなさいに変えたい、こんにちはがどこにあっても

		int index = array.indexOf("こんにちは");
		array.set(index, "おやすみなさい");

		for (int i = 0 ; i < array.size() ; i++) {
			String a = array.get(i);
			System.out.println(a);


		}
	}

}