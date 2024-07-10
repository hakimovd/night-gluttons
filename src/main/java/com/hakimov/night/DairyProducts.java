package com.hakimov.night;

public class DairyProducts  extends Product {

    private String fatPercentage;

    public DairyProducts(String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String getProduct () {
        return "Молочный продукт: " + fatPercentage + "%";
    }
}
