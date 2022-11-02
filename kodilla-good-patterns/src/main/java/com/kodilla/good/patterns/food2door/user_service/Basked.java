package com.kodilla.good.patterns.food2door.user_service;

import com.kodilla.good.patterns.allegro.OrderRequest;
import com.kodilla.good.patterns.allegro.products.Game;
import com.kodilla.good.patterns.allegro.products.Toys;
import com.kodilla.good.patterns.food2door.producer.ProducerInfo;
import com.kodilla.good.patterns.food2door.producer.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Basked {
    private final User user;

    private final List<ProducerInfo> productList = new ArrayList<>();

    public Basked(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public List<ProducerInfo> getProductList() {
        return productList;
    }

    public void addProductToList(Product product){
        productList.add(product);
    }

    public void removeProductFromList(int positionInList){
        productList.remove(positionInList);
    }

    public OrderRequest retrieve() {
        addProductToList(new Product("kanapka",5));
        addProductToList(new Product());

        return new OrderRequest(user, productList);

    }
}
