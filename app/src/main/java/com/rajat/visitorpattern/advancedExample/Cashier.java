package com.rajat.visitorpattern.advancedExample;

/**
 * Created by rajat028 on 17/12/17.
 */

public class Cashier implements ShopingMallVisitor {

    private String cashierName;

    private int totalPrice;

    public Cashier(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    @Override
    public void visit(Product product) {
        totalPrice = totalPrice + product.getPrice();
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }
}
