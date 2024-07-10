package com.hakimov.night;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Refrigerator {

    private List<Product> model = new ArrayList<>();

    @Autowired
    public void setModel(@Qualifier("milk") DairyProducts milk,
                         @Qualifier("kefir") DairyProducts kefir,
                         @Qualifier("potato") PlantProducts potato,
                         @Qualifier("mango") PlantProducts mango) {
        model.add(milk);
        model.add(kefir);
        model.add(potato);
        model.add(mango);
    }

    public void showList() {
        for(Product product : model) {
            System.out.println(product.getProduct());
        }
    }
}
