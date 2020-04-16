package com.kodedu.config;

import com.kodedu.coupling.LazerPrinter;
import com.kodedu.coupling.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Printer lazerPrinter(){
        LazerPrinter lazerPrinter= new LazerPrinter();
        return lazerPrinter;
    }

}
