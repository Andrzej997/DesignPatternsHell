package com.mateusz.scanerfactory;

/**
 * Created by Mateusz on 04.05.2017.
 */
public enum ScanerTypeEnum {
    SMARTPHONE("Smartphone", 100.0f),
    SCANER("Scaner", 25.0f);

    private String name;
    private Float cost;

    ScanerTypeEnum(String name, Float cost){
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
