package adapter_design_pattern;

import adapter_design_pattern.WeightMachineForBabies;

import adapter_design_pattern.WeightMachineAdapter;
import adapter_design_pattern.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
