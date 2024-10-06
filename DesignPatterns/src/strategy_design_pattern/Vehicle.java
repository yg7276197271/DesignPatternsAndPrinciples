package strategy_design_pattern;

public class Vehicle {

	DriveStrategy driveStrategy; //has-a relationship

	//This is also know as  Constructor Injection
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive(){
		driveStrategy.drive();
	}
	
}
