package com.rajat.visitorpattern.advancedExample;

/**
 * Created by rajat028 on 17/12/17.
 */

public abstract  class Product {

    protected int price;

    public abstract void accept(ShopingMallVisitor visitor);

    public int getPrice() {
        return price;
    }

}
