package com.kodedu.coupling;

public class ClassicPrinter implements Printer {

    public void print(){
        System.out.println(this.getClass().getName() + " works..");
    }
}
