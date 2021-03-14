package bennkyou;

public class Fit extends Car {

	private String rideQuality;//乗り心地

	Fit() {
		super(1500, 200, "bbbb");
	}

	public void printRideQuality() {
		System.out.println(this.rideQuality);
	}

	/*public String getRideQuality() {
		return rideQuality;
	}
	
	public void setRideQuality(String rideQuality) {
		this.rideQuality = rideQuality;
	}*/

}
