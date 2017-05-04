package com.mateusz.abstractfactory;

import com.mateusz.printerfactory.IPrintable;
import com.mateusz.printerfactory.PrinterTypeEnum;
import com.mateusz.scanerfactory.IScanable;
import com.mateusz.scanerfactory.ScanerTypeEnum;

/**
 * Created by Mateusz on 04.05.2017.
 */
public abstract class AbstractFactory {

    public IPrintable getPrinter(PrinterTypeEnum printerTypeEnum){
        return null;
    }

    public IScanable getScaner(ScanerTypeEnum scanerTypeEnum){
        return null;
    }

}
