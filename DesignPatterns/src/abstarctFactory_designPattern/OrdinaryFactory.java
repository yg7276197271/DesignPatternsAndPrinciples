package abstarctFactory_designPattern;

public class OrdinaryFactory implements VehicleFactory{

	public Vehicle getVehicle(String model) {
		Vehicle vehicle = null;
		switch (model) {
		case "ordinaryV1":
			vehicle = new OrdinaryV1();
			break;

		case "ordinaryV2":
			vehicle = new OrdinaryV2();
			break;

	
		default:
			break;
		}
		return vehicle;

	}
}
