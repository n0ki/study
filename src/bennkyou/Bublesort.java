package bennkyou;

public class Bublesort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*53412の順で入っている
		バブルソートで降順に入れ替える
		結果５４３２１*/

		int[] num = { 1, 2, 5, 4, 3 };

		/*for (int i = num.length - 1; i > 0; i--) {
		
			if (num[i] > num[i - 1]) {
				int a = num[i];
				int b = num[i - 1];
				num[i] = b;
				num[i - 1] = a;
			}
		}
		for (int i = num.length - 1; i > 1; i--) {
		
			if (num[i] > num[i - 1]) {
				int a = num[i];
				int b = num[i - 1];
				num[i] = b;
				num[i - 1] = a;
			}
		}
		for (int i = num.length - 1; i > 2; i--) {
		
			if (num[i] > num[i - 1]) {
				int a = num[i];
				int b = num[i - 1];
				num[i] = b;
				num[i - 1] = a;
			}
		}
		for (int i = num.length - 1; i > 3; i--) {
		
			if (num[i] > num[i - 1]) {
				int a = num[i];
				int b = num[i - 1];
				num[i] = b;
				num[i - 1] = a;
			}
		}*/

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = num.length - 1; j > i; j--) {
				if (num[j] > num[j - 1]) {
					int a = num[j];
					int b = num[j - 1];
					num[j] = b;
					num[j - 1] = a;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
