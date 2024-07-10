package com.hakimov.night;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProductConfig.class
        );

        Refrigerator refrigerator = context.getBean("refrigerator", Refrigerator.class);

        refrigerator.showList();

        context.close();
    }
}
