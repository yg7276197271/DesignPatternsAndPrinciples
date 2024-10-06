package adapter_design_pattern;
//This is Adaptee Concrete class // already existing logic

public class WeightMachineForBabies implements WeightMachine{
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
