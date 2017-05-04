package com.mateusz.abstractfactory;

import com.mateusz.printerfactory.PrintingFactory;
import com.mateusz.scanerfactory.ScanerFactory;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class FactoryProducer {

    public AbstractFactory getFactory(FactoryTypeEnum factoryTypeEnum){
        if (factoryTypeEnum == null) {
            return null;
        }
        switch (factoryTypeEnum){
            case PRINTER_FACTORY:
                return new PrintingFactory();
            case SCANER_FACTORY:
                return new ScanerFactory();
            default:
                return null;
        }
    }
}
