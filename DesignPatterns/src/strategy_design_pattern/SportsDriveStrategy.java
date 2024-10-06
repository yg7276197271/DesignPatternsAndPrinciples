package strategy_design_pattern;

public class SportsDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sports Drive Capability");
	}

}
