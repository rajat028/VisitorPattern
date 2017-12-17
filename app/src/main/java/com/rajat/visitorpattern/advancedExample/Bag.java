package com.rajat.visitorpattern.advancedExample;

/**
 * Created by rajat028 on 17/12/17.
 */

public class Bag extends Product {

    private String brandCompany;
    private String capacity;

    public Bag(String brandCompany, String capacity,int price) {
        this.brandCompany = brandCompany;
        this.capacity = capacity;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrandCompany() {
        return brandCompany;
    }

    public String getCapacity() {
        return capacity;
    }

    @Override
    public void accept(ShopingMallVisitor visitor) {
        visitor.visit(this);
    }
}
