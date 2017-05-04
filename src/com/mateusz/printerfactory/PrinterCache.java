package com.mateusz.printerfactory;

import com.mateusz.abstractfactory.AbstractFactory;

import java.util.HashMap;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class PrinterCache {

    private HashMap<PrinterTypeEnum, IPrintable> printerCache;
    protected AbstractFactory printingFactory;

    public PrinterCache(AbstractFactory printingFactory){
        this.printerCache = new HashMap<>();
        this.printingFactory = printingFactory;
    }

    public IPrintable getPrinter(PrinterTypeEnum printerTypeEnum){
        if(printerTypeEnum == null){
            return null;
        }
        IPrintable printer = printerCache.get(printerTypeEnum);
        if(printer == null){
            printer = printingFactory.getPrinter(printerTypeEnum);
            printerCache.put(printerTypeEnum, printer);
            System.out.println("Getting object from factory");
        } else {
            System.out.println("Getting object from cache");
        }
        return printer;
    }
}
