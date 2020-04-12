package com.kodedu.coupling;

public class PrinterService {

    private final Printer printer;

    public PrinterService(Printer printer){
        this.printer= printer;
    }

    public void doService(){
        this.printer.print();
    }
}
