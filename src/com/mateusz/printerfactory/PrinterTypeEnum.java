package com.mateusz.printerfactory;

/**
 * Created by Mateusz on 04.05.2017.
 */
public enum PrinterTypeEnum {

    INK_PRINTER("Ink printer", 30.0f),
    LASER_PRINTER("Laser printer", 35.0f),
    _3D_PRINTER("3D printer", 40.0f);

    private String name;
    private Float cost;

    PrinterTypeEnum(String name, Float cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Float getCost() {
        return cost;
    }
}
