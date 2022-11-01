package com.kodilla.good.patterns.allegro.basket;

import com.kodilla.good.patterns.allegro.products.Product;
import com.kodilla.good.patterns.allegro.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserBasket implements Basket {
    private final User user;
    private final List<Product> productList = new ArrayList<>();

    public UserBasket(User user) {
        this.user = user;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void addProductToList(Product product) {
        productList.add(product);
    }

    @Override
    public void removeProductFromList(int listIndex) {
        productList.remove(listIndex);
    }

    @Override
    public boolean isBasketEmpty() {
        return productList.isEmpty();
    }

}
