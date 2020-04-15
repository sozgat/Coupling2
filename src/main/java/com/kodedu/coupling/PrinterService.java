package com.kodedu.coupling;

public class PrinterService {

    private Printer printer;

    public PrinterService(){}
    public PrinterService(Printer printer){
        this.printer= printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void doService(){
        this.printer.print();
    }
}
