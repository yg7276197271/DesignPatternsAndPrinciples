package abstarctFactory_designPattern;

import creational_design_patterns.abstract_factory_pattern.USACarFactory;

public class AbstractVehicleFactory {
	VehicleFactory vehicleFactory;

	public VehicleFactory getVehicleFactory(String factory) {

		switch (factory) {
		case "Luxury":
			vehicleFactory = new LuxuryFactory();
			break;

		case "Ordinary":
			vehicleFactory = new OrdinaryFactory();
			break;
		}
		return vehicleFactory;
	}

}
