package com.kodedu.config;

import com.kodedu.coupling.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrinterStarter {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Printer printer = context.getBean("classicPrinter",Printer.class);

        printer.print();
    }
}
