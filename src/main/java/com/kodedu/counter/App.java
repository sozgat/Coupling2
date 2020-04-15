package com.kodedu.counter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //Container -> Spring tek bir nesne oluşturuyor burada.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:counter-config.xml");

        // Nesneyi sunuyor.
        Counter counter= applicationContext.getBean(Counter.class);
        counter.increase();
        counter.increase();
        counter.increase();

        System.out.println("Sayaç Değeri: " + counter.getCounter()); // ? 3

        // Nesneyi sunuyor.
        Counter counter2 = applicationContext.getBean(Counter.class);
        counter2.increase();
        counter2.increase();

        System.out.println("Sayaç Değeri: " + counter2.getCounter()); // ? 5


    }
}
