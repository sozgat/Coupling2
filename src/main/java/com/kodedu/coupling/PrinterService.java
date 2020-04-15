package com.kodedu.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrinterService {

    @Autowired
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
