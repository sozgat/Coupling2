package com.kodedu.counter;

import org.springframework.stereotype.Component;

@Component
public class Counter {

    private int counter = 0;

    public void increase(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }

}
