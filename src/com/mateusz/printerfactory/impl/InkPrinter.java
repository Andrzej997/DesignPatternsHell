package com.mateusz.printerfactory.impl;

import com.mateusz.printerfactory.IPrintable;
import com.mateusz.printerfactory.PrinterTypeEnum;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class InkPrinter implements IPrintable {

    @Override
    public void print() {
        System.out.println("Printing on ink printer");
    }

    @Override
    public String getName() {
        return PrinterTypeEnum.INK_PRINTER.getName();
    }

    @Override
    public Float getCost() {
        return PrinterTypeEnum.INK_PRINTER.getCost();
    }
}
