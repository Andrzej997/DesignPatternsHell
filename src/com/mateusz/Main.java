package com.mateusz;

import com.mateusz.abstractfactory.AbstractFactory;
import com.mateusz.abstractfactory.FactoryProducer;
import com.mateusz.abstractfactory.FactoryTypeEnum;
import com.mateusz.multifunctionalmachineadapter.PrinterScanerAdapter;
import com.mateusz.multifunctionalmachinebuilder.IMachine;
import com.mateusz.multifunctionalmachinebuilder.MachineBuilder;
import com.mateusz.printerdecorator.IPrinterDecorator;
import com.mateusz.printerdecorator.impl.BasicPrinterDecorator;
import com.mateusz.printerfactory.PrinterCache;
import com.mateusz.printerfactory.PrinterTypeEnum;
import com.mateusz.scanerfactory.ScanerTypeEnum;

public class Main {

    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory factory = factoryProducer.getFactory(FactoryTypeEnum.PRINTER_FACTORY);
        factory.getPrinter(PrinterTypeEnum.INK_PRINTER).print();
        factory.getPrinter(PrinterTypeEnum._3D_PRINTER).print();
        factory =  factoryProducer.getFactory(FactoryTypeEnum.SCANER_FACTORY);
        factory.getScaner(ScanerTypeEnum.SCANER).scan(null);

        MachineBuilder machineBuilder = new MachineBuilder();
        IMachine firstMachine = machineBuilder.getFirstMachine();
        System.out.println(firstMachine.getName() + " " + firstMachine.getCost());

        IMachine secondMachine = machineBuilder.getSecondMachine();
        System.out.println(secondMachine.getName() + " " + secondMachine.getCost());

        PrinterCache printerCache = new PrinterCache(factoryProducer.getFactory(FactoryTypeEnum.PRINTER_FACTORY));
        printerCache.getPrinter(PrinterTypeEnum.INK_PRINTER).print();
        printerCache.getPrinter(PrinterTypeEnum.INK_PRINTER).print();

        factory =  factoryProducer.getFactory(FactoryTypeEnum.SCANER_FACTORY);
        PrinterScanerAdapter printerScanerAdapter = new PrinterScanerAdapter(factory.getScaner(ScanerTypeEnum.SCANER));
        System.out.println(printerScanerAdapter.getName() + " " + printerScanerAdapter.getCost());
        printerScanerAdapter.print();

        IPrinterDecorator printerDecorator = new BasicPrinterDecorator(printerCache.getPrinter(PrinterTypeEnum.INK_PRINTER));
        System.out.println(printerDecorator.getName() + " " + printerDecorator.getCost());
        printerDecorator.print();

    }


}
