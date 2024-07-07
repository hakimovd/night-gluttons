package com.hakimov.night;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {
    private List<Product> model = new ArrayList<>();

    public void setModel(List<Product> model) {
        this.model = model;
    }

    public void showList() {
        for(Product product : model) {
            System.out.println(product.getProduct());
        }
    }
}
