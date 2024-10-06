package strategy_design_pattern;

public class GoodsVehicle extends Vehicle {

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}

}
