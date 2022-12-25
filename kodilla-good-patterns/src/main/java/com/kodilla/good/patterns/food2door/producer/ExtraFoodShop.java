package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.OrderRequest;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producers {
    @Override
    public boolean process(OrderRequest orderRequest) {
        List<String> products = new ArrayList<>();
        products.add("Extra Fries");
        products.add("Extra Burger");
        products.add("Extra Pizza");

        return products.contains(orderRequest.getProductType());
    }
}
