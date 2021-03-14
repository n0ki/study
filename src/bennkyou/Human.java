package bennkyou;

public class Human {

	public static final String posuture = "2sokuhokou";

	private String name;
	private double weight;
	private double hight;

	public static void eating(String food) {
		System.out.println("私は" + food + "を食べます");
	}

	public static void sleapping(int time) {
		System.out.println("私は" + time + "時に寝ます");
	}

	/*BMIを計算するメソッド*/
	public static void calcBMI(double weight, double hight) {
		double a = weight;
		double b = hight;
		double bmi = a / (b * b);
		System.out.println("私のBMIは" + bmi + "です");
	}

	public double calcBMI2() {
		double A = this.weight;
		double B = this.hight;
		double BMI2 = A / (B * B);
		return BMI2;
	}

	public static void calcBMI(String name, double weight, double hight) {
		double a = weight;
		double b = hight;
		double bmi = a / (b * b);
		System.out.println(name + bmi);
	}

	Human(String name, double weight, double hight) {
		this.name = name;
		this.weight = weight;
		this.hight = hight;
	}

	/*Human(double weight) {
		this.weight = weight;
	}
	
	Human(double hight) {
		this.hight = hight;
	}*/

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getHight() {
		return this.hight;
	}

	public void setName(String namae) {
		this.name = namae;
	}

	public String getName() {
		return this.name;
	}

}
