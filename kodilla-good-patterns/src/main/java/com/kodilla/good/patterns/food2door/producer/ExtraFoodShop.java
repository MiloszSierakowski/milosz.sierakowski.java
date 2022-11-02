package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.producer.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements ProducerInfo {

    private final List<Product> productList = new ArrayList<>();

    public String getProducerInfo(){
        return "Sprzedaja extra jedzenie";
    }

    public List<Product> getProducts(){
        productList.add(new Product("Extra kanapka",200));
        productList.add(new Product("Extra sałatka",10));
        productList.add(new Product("Extra makaron",500));

        return productList;
    }



}
