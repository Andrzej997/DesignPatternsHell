package com.mateusz.multifunctionalmachinebuilder;

import com.mateusz.printerfactory.impl.InkPrinter;
import com.mateusz.printerfactory.impl.ThreeDimiensionPrinter;
import com.mateusz.scanerfactory.impl.Scaner;
import com.mateusz.scanerfactory.impl.Smartphone;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class MachineBuilder {

    public IMachine getFirstMachine(){
        MultifunctionalMachine machine = new MultifunctionalMachine();
        machine.addMachine(new InkPrinter());
        machine.addMachine(new Scaner());
        return machine;
    }

    public IMachine getSecondMachine(){
        MultifunctionalMachine machine = new MultifunctionalMachine();
        machine.addMachine(new ThreeDimiensionPrinter());
        machine.addMachine(new Smartphone());
        return machine;
    }
}
