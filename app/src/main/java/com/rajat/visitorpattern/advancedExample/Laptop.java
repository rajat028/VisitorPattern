package com.rajat.visitorpattern.advancedExample;

/**
 * Created by rajat028 on 17/12/17.
 */

public class Laptop extends Product {

    private String brand;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void accept(ShopingMallVisitor visitor) {
        visitor.visit(this);
    }
}
