package com.hakimov.night;

public class DairyProducts  extends Product {
    private String fatPercentage;

    public void setFatPercentage (String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String getProduct () {
        return "Молочный продукт: " + fatPercentage + "%";
    }
}
