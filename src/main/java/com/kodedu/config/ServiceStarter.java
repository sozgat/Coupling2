package com.kodedu.config;

import com.kodedu.config.PrinterService;
import com.kodedu.coupling.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceStarter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PrinterService printerService = context.getBean(PrinterService.class);

        printerService.doService();
    }
}
