package com.kodedu.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        PrinterService printerService = applicationContext.getBean(PrinterService.class);
        printerService.doService();
        //Test
    }
}
