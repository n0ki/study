package bennkyou;

public class Array {
	public static void main(String[] args) {
		//１から１０までの固定長配列

		int[] numArray = new int[10];

		numArray[0] = 2;
		numArray[1] = 1;
		numArray[2] = 4;
		numArray[3] = 3;
		numArray[4] = 6;
		numArray[5] = 5;
		numArray[6] = 7;
		numArray[7] = 8;
		numArray[8] = 9;
		numArray[9] = 10;

		//配列の中の数字が偶数だけ足す
		int sum = 0;
		/*for (int i = 1; i < numArray.length; i=i+2) {
			sum = sum + numArray[i];
		}
		System.out.println(sum);*/

		//↑だと偶数番目が偶数前提だからダメ

		for (int i = 0; i < numArray.length ; i++) {
			if(numArray[i]%2==0) {
				sum = sum + numArray[i];
			}
		}
		System.out.println(sum);

		}



}