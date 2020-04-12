package com.kodedu.coupling;

public class App {

    public static void main(String[] args) {
        Printer printer = new ClassicPrinter();
        Printer lazerPrinter = new LazerPrinter();
        PrinterService printerService = new PrinterService(lazerPrinter);
        printerService.doService();
    }
}
