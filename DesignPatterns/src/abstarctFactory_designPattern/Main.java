package abstarctFactory_designPattern;

public class Main {
	public static void main(String[] args) {
		AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
		System.out.println(abstractVehicleFactory.getVehicleFactory("Luxury").getVehicle("luxuryv1").average());
	}
}
