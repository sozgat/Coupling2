package com.kodedu.config;

import com.kodedu.counter.App;
import com.kodedu.coupling.LazerPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppStarter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        LazerPrinter lazerPrinter = context.getBean(LazerPrinter.class);

        lazerPrinter.print();

    }
}
