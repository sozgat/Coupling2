package com.kodedu.coupling;

import org.springframework.stereotype.Component;

@Component
public class LazerPrinter implements Printer {


    public void print() {
        System.out.println(this.getClass().getName() + " works..");
    }
}
