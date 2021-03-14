package bennkyou;

import java.util.ArrayList;
import java.util.List;

public class Deepcopy {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		List<Integer> list2 = new ArrayList<Integer>(list);
		//System.arraycopy(list, 0, list2, 0, list.size());
		//System.arraycopyはArrayListは使えない
		list2.add(3);
		for (int num : list) {
			System.out.println(num);
		}
		for (int num : list2) {
			System.out.println(num);
		}
	}

}
