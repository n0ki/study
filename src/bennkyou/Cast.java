package bennkyou;

public class Cast {
	public static void main(String[] args) {
		/*
		 * 0,9,12,2,3,4,1,99,99,99という数字固定長配列が存在する
		 * 10未満の数字で偶数のときは「Even: [数字]」の形式で出力する
		 * 奇数のときはその奇数をその奇数の前の数字で割ったものを「Odd: [割った結果]」の形式で出力する
		 * 10以上の数字の場合は何もしない
		 * 99が出現した以降は99しか含まれないので処理する必要はない
		 * なお無駄な処理はスキップすること
		 * 0除算の際には「0除算できません」と表示
		 *
		 *
		 * 結果(想定)
		 * Even:0
		 * 0除算できません
		 * Even:2
		 * Odd:1.5
		 * Even:4
		 * Odd:0.25
		 */

		int[] intArray = { 0, 9, 12, 2, 3, 4, 1, 99, 99, 99 };

		for (int i = 0; i < intArray.length; i++) {
			//10未満の時かつ偶数の時
			if (intArray[i] < 10 && intArray[i] % 2 == 0) {
				System.out.println("Even:" + intArray[i]);
				//１０未満の時かつ奇数の時
			} else if (intArray[i] < 10 && intArray[i] % 2 == 1) {
				float flo = (float) intArray[i];
				if (intArray[i - 1] != 0) {
					System.out.println("Odd:" + ((float) intArray[i]) / (float) intArray[i - 1]);
				} else {
					System.out.println("0除算できません");
				}
				//１０以上の時何もしない
			} else if (intArray[i] >= 10) {
				continue;
				//99でたら終了
			} else if (intArray[i] == 99) {
				break;
			}
		}
	}
}

/*模範解答
package data_algorithm;
​
public interface Main {
	public static void main(String args[]) {
		/*
		 * 0,9,12,2,3,4,1,99,99,99という数字固定長配列が存在する
		 * 10未満の数字で偶数のときは「Even: [数字]」の形式で出力する
		 * 奇数のときはその奇数をその奇数の前の数字で割ったものを「Odd: [割った結果]」の形式で出力する
		 * 10以上の数字の場合は何もしない
		 * 99が出現した以降は99しか含まれないので処理する必要はない
		 * なお無駄な処理はスキップすること
		 * 0除算の際には「0除算できません」と表示
		 *
		 *
		 * 結果(想定)
		 * Even:0
		 * 0除算できません
		 * Even:2
		 * Odd:1.5
		 * Even:4
		 * Odd:0.25
		 
		int[] intArray = { 0, 9, 12, 2, 3, 4, 1, 99, 99, 99 };
		for (int i = 0; i < intArray.length; i++) {
			int num = intArray[i];
			// 99が出現した場合は終了する
			if (num == 99) {
				break;
			}
			//１０以上の時何もしない
			if (num >= 10) {
				continue;
			}
			if (num % 2 == 0) {
				// 偶数の時
				System.out.println("Even:" + num);
			} else {
				// 奇数の時
				int beforeNum = 1;
				if (i - 1 < 0) {
					// 前の数字が存在しないので飛ばす
					continue;
				}
				beforeNum = intArray[i - 1];
				if (beforeNum != 0) {
					float flo = (float)num / beforeNum;
					System.out.println("Odd:" + flo);
				} else {
					System.out.println("0除算できません");
				}
			}
		}
	}
}
*/

//よく使うやつは外だしして宣言する
//例外的処理は先に処理しておく
