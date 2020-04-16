package com.kodedu.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CounterStarter {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Counter counter = context.getBean(Counter.class);

        counter.increase();
        counter.increase();
        counter.increase();

        System.out.println("Sayaç Değeri: "+counter.getCounter()); // 3
    }
}
