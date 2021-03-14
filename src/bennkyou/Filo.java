package bennkyou;

import java.util.Stack;

public class Filo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*			0: ttps://localhost/user/
					1: ttps://localhost/user/abc
					2: ttps://localhost/user/abc/profile
					3: ttps://localhost/user/abc
					4: ttps://localhost/test-result
					開始地点:3
					back
					foward
					back
					back*/

		Stack<String> web = new Stack<String>();

		web.push("ttps://localhost/user/");
		web.push("ttps://localhost/user/abc");
		web.push("ttps://localhost/user/abc/profile");
		web.push("ttps://localhost/user/abc");

		web.pop();
		web.push("ttps://localhost/user/abc");
		web.pop();
		web.pop();

		System.out.println(web.pop());

		/*stackは古いので今は使わないのが主流
		arraydequeueを使う
		*/
	}

}
