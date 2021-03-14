package bennkyou;

public class Control {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		fo();
	}
	public static void swt() {
		int num1=3;
		switch(num1) {
			case 3:
				System.out.println("HELLO");
				break;       //ここのbreak忘れると下まで条件が付きぬける⇒HELLWORLDとでる
			case 5:	          //←このときは５と４の時にWORLDって出る
			case 4:
				System.out.println("WORLD");
				break;
			default:
				System.out.println("aaaaaaa");
		}

	}

	public static void fo() {
		int num=0;
		swt();
		//int sum=0;
			for(int i=1; i<5;i++) {
				num=num+i;
			}
			System.out.println(num);
	}

}
