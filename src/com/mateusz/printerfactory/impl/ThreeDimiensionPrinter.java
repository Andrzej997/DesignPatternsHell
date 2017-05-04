package com.mateusz.printerfactory.impl;

import com.mateusz.printerfactory.IPrintable;
import com.mateusz.printerfactory.PrinterTypeEnum;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class ThreeDimiensionPrinter implements IPrintable {
    @Override
    public void print() {
        System.out.println("Printing on 3D printer");
    }

    @Override
    public String getName() {
        return PrinterTypeEnum._3D_PRINTER.getName();
    }

    @Override
    public Float getCost() {
        return PrinterTypeEnum._3D_PRINTER.getCost();
    }
}
