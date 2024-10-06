package creational_design_patterns.abstract_factory_pattern;

public class MiniCar extends Car{
	MiniCar(Location location)
    {
        super(CarType.MINI,location );
        construct();
    }
     
    @Override
    void construct()
    {
        System.out.println("Connecting to Mini car");
    }
}
