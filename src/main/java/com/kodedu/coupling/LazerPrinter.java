package com.kodedu.coupling;

public class LazerPrinter implements Printer {


    public void print() {
        System.out.println(this.getClass().getName() + " works..");
    }
}
