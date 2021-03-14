package bennkyou;

public class GTR extends Car {

	private int maxSpeed;//最高速度

	GTR(int maxSpeed) {
		super(2500, 400, "GTR");
		this.maxSpeed = maxSpeed;
	}

	public void printMaxSpeed() {

		System.out.println(this.maxSpeed);
		//return maxSpeed;
	}

	/*public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}*/

}
