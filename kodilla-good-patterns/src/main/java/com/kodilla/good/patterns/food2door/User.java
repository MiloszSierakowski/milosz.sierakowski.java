package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producer.Producer;
import com.kodilla.good.patterns.food2door.product.Product;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public OrderRequest makeOrder(){

        Producer producer = new ExtraFoodShop();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("kanapka",10));
        productList.add(new Product("pizza",4));

        return new OrderRequest(productList,producer);
    }

}
