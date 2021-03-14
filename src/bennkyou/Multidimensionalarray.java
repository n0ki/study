package bennkyou;

import java.util.ArrayList;
import java.util.List;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 3人の子供がいました。3人はテストを受けました。それぞれの科目と点数は以下の通りです。
		 * 一郎 算数:40  国語:20  社会:60  家庭科: 30
		 * 次郎 国語:100 算数:60  社会:90  家庭科: 50
		 * 三郎 社会:10  算数:100 国語:100 家庭科: 90
		 * 各科目ごとの最高点数、最低点数、平均点を算出してください
		 */
		/*やりたいこと(やらなきゃいけないこと)
		 * 教科の後ろの点数を取りたい
		 * とってきた点数をint型にしたい
		 * 教科ごとのとってきた点数を合計する⇒
		 * 教科ごとのとってきた点数を比べたい(大きいかどうか)
		*/
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("算数");
		list2.add("40");
		list2.add("国語");
		list2.add("20");
		list2.add("社会");
		list2.add("60");
		list2.add("家庭科");
		list2.add("30");
		list.add(list2);
		list2 = new ArrayList<String>();
		list2.add("国語");
		list2.add("100");
		list2.add("算数");
		list2.add("60");
		list2.add("社会");
		list2.add("90");
		list2.add("家庭科");
		list2.add("50");
		list.add(list2);
		list2 = new ArrayList<String>();
		list2.add("社会");
		list2.add("10");
		list2.add("算数");
		list2.add("100");
		list2.add("国語");
		list2.add("100");
		list2.add("家庭科");
		list2.add("90");
		list.add(list2);

		int math = 0;
		int jap = 0;
		int soc = 0;
		int hom = 0;
		int[] math1 = new int[3];
		int[] jap1 = new int[3];
		int[] soc1 = new int[3];
		int[] hom1 = new int[3];
		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.get(i).size(); j++) {
				String arr = list.get(i).get(j);
				//int sum = 0;
				if (arr == "算数") {
					math = Integer.parseInt(list.get(i).get(j + 1));
					//sum += math;
					math1[i] = math;

				} else if (arr == "国語") {
					jap = Integer.parseInt(list.get(i).get(j + 1));
					jap1[i] = jap;
				} else if (arr == "社会") {
					soc = Integer.parseInt(list.get(i).get(j + 1));
					soc1[i] = soc;
				} else if (arr == "家庭科") {
					hom = Integer.parseInt(list.get(i).get(j + 1));
					hom1[i] = hom;
				} else {
					continue;
				}

			}

		}
		int msum = 0;
		int mav = 0;
		int mmax = 0;
		int mmin = 0;
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(math1[i]);
			msum = msum + math1[i];
			mav = msum / list.size();

			mmax = math1[0];
			if (mmax <= math1[i]) {
				mmax = math1[i];
			}

			mmin = math1[0];
			if (mmin >= math1[i]) {
				mmin = math1[i];
			}

		}
		System.out.println("算数の平均値は" + mav);
		System.out.println("算数の最大点数は" + mmax);
		System.out.println("算数の最小点は" + mmin);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(jap1[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(soc1[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(hom1[i]);
		}

	}

}

/*
 * ↓模範解答↓
 * 		for (int i = 0; i < list.size(); i++) {
			List<String> tmpList = list.get(i);
			for (int j = 0; j < tmpList.size(); j++) {
				String str = tmpList.get(j);
				if ("算数".equals(str)) {
					int mathScore = Integer.parseInt(tmpList.get(j + 1));
					mathArray[i] = mathScore;
				} else if ("国語".equals(str)) {
					int japScore = Integer.parseInt(tmpList.get(j + 1));
					japArray[i] = japScore;
				} else if ("社会".equals(str)) {
					int socScore = Integer.parseInt(tmpList.get(j + 1));
					socArray[i] = socScore;
				} else if ("家庭科".equals(str)) {
					int homScore = Integer.parseInt(tmpList.get(j + 1));
					homArray[i] = homScore;
				}
			}
		}
		int mathSumScore = 0;
		int mathMaxScore = -10;
		int mathMinScore = 110;
		for (int i = 0; i < mathArray.length; i++) {
			int score = mathArray[i];
			mathSumScore += score;
			mathMaxScore = Math.max(mathMaxScore, score);
			mathMinScore = Math.min(mathMinScore, score);
		}
		int mathAvgScore = mathSumScore / mathArray.length;
		System.out.println("算数の平均値は" + mathAvgScore);
		System.out.println("算数の最大点数は" + mathMaxScore);
		System.out.println("算数の最小点は" + mathMinScore);
Collapse




 */
