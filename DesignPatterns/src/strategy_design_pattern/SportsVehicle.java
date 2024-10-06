package strategy_design_pattern;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}

}
