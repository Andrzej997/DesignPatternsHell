package com.mateusz.printerfactory;

import com.mateusz.abstractfactory.AbstractFactory;
import com.mateusz.printerfactory.impl.InkPrinter;
import com.mateusz.printerfactory.impl.LaserPrinter;
import com.mateusz.printerfactory.impl.ThreeDimiensionPrinter;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class PrintingFactory extends AbstractFactory {

    @Override
    public IPrintable getPrinter(PrinterTypeEnum printerTypeEnum){
        if(printerTypeEnum == null){
            return null;
        }
        switch (printerTypeEnum){
            case _3D_PRINTER:
                return new ThreeDimiensionPrinter();
            case INK_PRINTER:
                return new InkPrinter();
            case LASER_PRINTER:
                return new LaserPrinter();
        }
        return null;
    }
}
