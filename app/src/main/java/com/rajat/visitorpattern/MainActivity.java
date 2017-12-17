package com.rajat.visitorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.rajat.visitorpattern.advancedExample.Bag;
import com.rajat.visitorpattern.advancedExample.Cashier;
import com.rajat.visitorpattern.advancedExample.Laptop;
import com.rajat.visitorpattern.advancedExample.Product;
import com.rajat.visitorpattern.basicExample.Child;
import com.rajat.visitorpattern.basicExample.HealthSpecailist;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnBasic, btnAdvanced;

    ArrayList<Child> mArrayChild = new ArrayList<>();
    ArrayList<Product> mPurchasedProductArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnBasic = (Button) findViewById(R.id.btn_basic);

        btnAdvanced = (Button) findViewById(R.id.btn_advanced);

        /// adding child elements in arrayList.
        /// a single health specailist visits every childern and tells about the health report of each childern
        btnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /// Creating a health specallist
                HealthSpecailist mHealthSpecailist = new HealthSpecailist("Rajat Arora");

                /// clearing child arraylist
                mArrayChild.clear();

                /// adding childern in array...
                mArrayChild.add(new Child("John", "Good"));
                mArrayChild.add(new Child("Mike", "Bad"));
                mArrayChild.add(new Child("Bruno", "poor"));
                mArrayChild.add(new Child("Seth", "Excelllent"));
                mArrayChild.add(new Child("Tyson", "Poor"));

                /// every child accepts the doctor to check them, and provide their health reports.
                for (Child child : mArrayChild) {
                    child.accept(mHealthSpecailist);
                }
            }
        });

        /// adding products elements in array list
        /// a cashier will vist every product element and sums up the product
        btnAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /// creating a cashier object that will visit every product and get their price
                Cashier cashier = new Cashier("Rajat Arora");

                /// clearing purchased arraylist
                mPurchasedProductArrayList.clear();

                /// adding product elements in purchased array list
                mPurchasedProductArrayList.add(new Laptop("Apple", 100000));
                mPurchasedProductArrayList.add(new Laptop("hp", 70000));
                mPurchasedProductArrayList.add(new Laptop("Lenovo", 50000));
                mPurchasedProductArrayList.add(new Bag("WildCraft", "25L", 2000));
                mPurchasedProductArrayList.add(new Bag("American Tourister", "15L", 1500));
                mPurchasedProductArrayList.add(new Bag("Sky Bags", "10L", 1800));

                /// cashier will visit each product element.
                for (Product product : mPurchasedProductArrayList) {
                    cashier.visit(product);
                }
                /// output : total amount received by cashier.
                Log.d("Total Amount ", "collected by " + cashier.getCashierName() + " is " + cashier.getTotalPrice());
            }
        });


    }
}
