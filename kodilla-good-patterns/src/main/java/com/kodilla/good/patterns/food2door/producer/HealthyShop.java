package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.OrderRequest;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producers {
    @Override
    public boolean process(OrderRequest orderRequest) {
        List<String> products = new ArrayList<>();
        products.add("Health Fries");
        products.add("Health Burger");
        products.add("Health Pizza");

        return products.contains(orderRequest.getProductType());
    }
}
