package com.hakimov.night;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.hakimov.night")
@Configuration
public class ProductConfig {

    @Bean
    public DairyProducts milk() {
        return new DairyProducts("1");
    }
    @Bean
    public DairyProducts kefir() {
        return new DairyProducts("2.5");
    }

    @Bean
    public PlantProducts potato() {
        return new PlantProducts("Potato");
    }

    @Bean
    public PlantProducts mango() {
        return new PlantProducts("Mango");
    }
}
