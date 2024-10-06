package adapter_design_pattern;
//This is adapter Concreate class used to conver weight from pound to kg

import adapter_design_pattern.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine; // has a relation 

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPound();

        //Convert it to KGs
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}
