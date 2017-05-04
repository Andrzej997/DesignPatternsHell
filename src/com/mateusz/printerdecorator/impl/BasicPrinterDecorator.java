package com.mateusz.printerdecorator.impl;

import com.mateusz.printerdecorator.IPrinterDecorator;
import com.mateusz.printerfactory.IPrintable;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class BasicPrinterDecorator implements IPrinterDecorator {

    private IPrintable printer;

    public BasicPrinterDecorator(IPrintable printer) {
        this.printer = printer;
    }

    @Override
    public String getName() {
        return "Custom " + printer.getName();
    }

    @Override
    public Float getCost() {
        return 20.0f + printer.getCost();
    }

    @Override
    public void print() {
        printer.print();
        System.out.println("Changing page");
        printer.print();
    }
}
