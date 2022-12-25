package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.OrderRequest;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producers {
    @Override
    public boolean process(OrderRequest orderRequest) {
        List<String> products = new ArrayList<>();
        products.add("Gluten Free Fries");
        products.add("Gluten Free Burger");
        products.add("Gluten Free Pizza");

        return products.contains(orderRequest.getProductType());
    }
}
