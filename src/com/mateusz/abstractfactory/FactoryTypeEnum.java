package com.mateusz.abstractfactory;

/**
 * Created by Mateusz on 04.05.2017.
 */
public enum  FactoryTypeEnum {

    PRINTER_FACTORY("Printer factory"),
    SCANER_FACTORY("Scaner factory");

    private String name;

    FactoryTypeEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
