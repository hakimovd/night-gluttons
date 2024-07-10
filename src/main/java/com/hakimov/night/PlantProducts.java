package com.hakimov.night;

public class PlantProducts extends Product {

    private String namePlant;

    public PlantProducts(String namePlant) {
        this.namePlant = namePlant;
    }

    @Override
    public String getProduct () {
        return "Растительный продукт: " + namePlant;
    }
}
