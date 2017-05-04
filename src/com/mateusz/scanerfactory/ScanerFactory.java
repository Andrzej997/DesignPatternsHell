package com.mateusz.scanerfactory;

import com.mateusz.abstractfactory.AbstractFactory;
import com.mateusz.scanerfactory.impl.Scaner;
import com.mateusz.scanerfactory.impl.Smartphone;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class ScanerFactory extends AbstractFactory {

    @Override
    public IScanable getScaner(ScanerTypeEnum scanerTypeEnum){
        if(scanerTypeEnum == null){
            return null;
        }
        switch (scanerTypeEnum){
            case SCANER:
                return new Scaner();
            case SMARTPHONE:
                return new Smartphone();
            default:
                return null;
        }
    }
}
