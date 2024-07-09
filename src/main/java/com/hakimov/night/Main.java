package com.hakimov.night;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Refrigerator refrigerator = context.getBean("refrigerator", Refrigerator.class);
        refrigerator.showList();
        
        context.close();
    }
}
