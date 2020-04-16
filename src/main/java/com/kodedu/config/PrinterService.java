package com.kodedu.config;

import com.kodedu.coupling.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrinterService {


    private Printer printer;

    public PrinterService(){}

    @Autowired
    public PrinterService(@Qualifier(value = "lazerPrinter") Printer printer){
        this.printer= printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void doService(){
        this.printer.print();
    }
}
