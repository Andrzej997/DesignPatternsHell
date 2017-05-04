package com.mateusz.multifunctionalmachinebuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class MultifunctionalMachine implements IMachine{

    private List<IMachine> machineList;

    public MultifunctionalMachine(){
        this.machineList = new ArrayList<>();
    }

    public void addMachine(IMachine machine){
        this.machineList.add(machine);
    }

    public List<IMachine> getMachineList() {
        return machineList;
    }

    public void setMachineList(List<IMachine> machineList) {
        this.machineList = machineList;
    }

    @Override
    public String getName() {
        final String[] name = {""};
        machineList.forEach(iMachine -> name[0] += iMachine.getName());
        return name[0];
    }

    @Override
    public Float getCost() {
        final Float[] sum = {0.0f};
        machineList.forEach(iMachine -> sum[0] += iMachine.getCost());
        return sum[0];
    }
}
