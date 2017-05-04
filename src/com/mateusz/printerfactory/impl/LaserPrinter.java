package com.mateusz.printerfactory.impl;

import com.mateusz.printerfactory.IPrintable;
import com.mateusz.printerfactory.PrinterTypeEnum;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class LaserPrinter implements IPrintable {

    @Override
    public void print() {
        System.out.println("Printing on LaserPrinter");
    }

    @Override
    public String getName() {
        return PrinterTypeEnum.LASER_PRINTER.getName();
    }

    @Override
    public Float getCost() {
        return PrinterTypeEnum.LASER_PRINTER.getCost();
    }
}
