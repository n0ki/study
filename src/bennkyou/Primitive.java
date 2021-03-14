package bennkyou;

public class Primitive {

	public static void main(String[] args) {
		intg();

	}

	public static void bool() {
		boolean isTrue = false;
		isTrue = true;
		if(isTrue){
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

	public static void chr() {
		char moji='a';
		System.out.println(moji);  //一文字だけ

	}

	public static void flt() {
		float num1=1.5f;
		float num2=2.6f;   //宣言した後に文字必要な場合がある

		float sum=num1 + num2;
		System.out.println(sum);
	}

	public static void intg() {
		int num1=2;
		int num2=3;
		int sum=num1+num2;
		if(sum==5) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}



}

