package strategy_design_pattern;

public class XYZDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("XYZ Drive Capability");
	}

}
