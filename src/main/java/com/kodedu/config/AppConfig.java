package com.kodedu.config;

import com.kodedu.coupling.ClassicPrinter;
import com.kodedu.coupling.LazerPrinter;
import com.kodedu.coupling.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
//@ImportResource(value = "classpath:spring-config.xml")
public class AppConfig {

    @Bean
    public Printer lazerPrinter(){
        LazerPrinter lazerPrinter= new LazerPrinter();
        return lazerPrinter;
    }

    @Bean
    public Printer classicPrinter(){
        return new ClassicPrinter();
    }
}
