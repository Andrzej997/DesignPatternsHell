package com.mateusz.multifunctionalmachineadapter;

import com.mateusz.printerfactory.IPrintable;
import com.mateusz.scanerfactory.IScanable;

import java.io.File;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class PrinterScanerAdapter implements IPrintable {

    private IScanable scaner;

    public PrinterScanerAdapter(IScanable scaner) {
        this.scaner = scaner;
    }

    @Override
    public String getName() {
        return scaner.getName();
    }

    @Override
    public Float getCost() {
        return scaner.getCost();
    }

    @Override
    public void print() {
        scaner.scan(new File("http://path-to-nothing.com"));
        System.out.println("Printing scanned file");
    }
}
