package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.producer.product.Product;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements ProducerInfo {

    private final List<Product> productList = new ArrayList<>();


    public String getProducerInfo(){
        return "Sprzedaje witaminy???";
    }

    public List<Product> getProducts(){
        productList.add(new Product("Gluten Free kanapka",200));
        productList.add(new Product("Gluten Free sałatka",10));
        productList.add(new Product("Gluten Free makaron",500));
        productList.add(new Product("Gluten Free mleko",15));

        return productList;
    }
}
