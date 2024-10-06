package abstarctFactory_designPattern;

public class LuxuryFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String model) {
		Vehicle vehicle = null;
		switch (model) {

		case "luxuryv1":
			vehicle = new LuxuryV1();
			break;
		case "luxuryv2":
			vehicle = new LuxuryV2();
			break;
		default:
			break;
		}
		return vehicle;

	}
}
