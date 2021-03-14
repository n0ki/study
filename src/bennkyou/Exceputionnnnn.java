package bennkyou;

public class Exceputionnnnn {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] ary = { "1", null, "500", "あいうえお" };
		for (int i = 0; i < ary.length; i++) {
			int num = henkan(ary[i]);
			System.out.println(num);
		}

		/*num = henkan(ary[0]);
		System.out.println(num);
		num = henkan(ary[1]);
		System.out.println(num);
		num = henkan(ary[2]);
		System.out.println(num);
		num = henkan(ary[3]);
		System.out.println(num);*/

	}

	public static int henkan(String str) {

		int num;

		try {
			if (str == null) {
				throw new NullPointerException();
			}
			num = Integer.parseInt(str);

		} catch (NumberFormatException ex) {
			num = -1;

		} catch (NullPointerException ex) {
			System.out.println("ぬるぽ");
			num = 0;
		} finally {
			System.out.println("変換処理が終了しました");
		}
		return num;
	}
}
