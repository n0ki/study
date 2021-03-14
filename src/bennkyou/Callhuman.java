package bennkyou;

public class Callhuman {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human human = new Human("bbb", 60, 1.6);

		human.setName("aiueo");
		String name = human.getName();

		System.out.println("私の名前は" + name + "です");

		Human.eating("aaa");
		Human.sleapping(1);
		//human.setWeight(50);
		double weight = human.getWeight();
		//human.setHight(1.5);
		double hight = human.getHight();

		System.out.println("私の体重は" + weight + "です");
		System.out.println("私の身長は" + hight + "です");

		Human.calcBMI(50, 1.5);
		double BMI2 = human.calcBMI2();
		System.out.println(BMI2);

		/*		Human human2 = new Human();
		
				Human.eating("bbbb");
				Human.sleapping(2);
				human2.setWeight(60);
				int weight2 = human2.getWeight();
		
				System.out.println(weight2);*/
	}

}
