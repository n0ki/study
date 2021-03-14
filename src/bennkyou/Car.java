package bennkyou;

public class Car {

	protected int displacement;//排気量
	protected int price;//価格
	protected String vehicleType;//車種

	Car(int displacement, int price, String vehicleType) {
		this.displacement = displacement;
		this.price = price;
		this.vehicleType = vehicleType;
	}

	public void printVehicleType() {
		System.out.println(this.vehicleType);
	}

	public void calcVehicleInspectionFee() {
		if (this.displacement > 2000) {
			System.out.println("車検料は10000円です");
		} else {
			System.out.println("車検料は5000円です");
		}
	}

}
