package com.mateusz.scanerfactory;

import com.mateusz.multifunctionalmachinebuilder.IMachine;

import java.io.File;

/**
 * Created by Mateusz on 04.05.2017.
 */
public interface IScanable extends IMachine{

    void scan(File file);
}
