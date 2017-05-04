package com.mateusz.scanerfactory.impl;

import com.mateusz.scanerfactory.IScanable;
import com.mateusz.scanerfactory.ScanerTypeEnum;

import java.io.File;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class Scaner implements IScanable {
    @Override
    public void scan(File file) {
        System.out.println("Scaner is scanning the file");
    }

    @Override
    public String getName() {
        return ScanerTypeEnum.SCANER.getName();
    }

    @Override
    public Float getCost() {
        return ScanerTypeEnum.SCANER.getCost();
    }
}
