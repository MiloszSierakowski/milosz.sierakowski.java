package com.kodilla.good.patterns.allegro.basket;

import com.kodilla.good.patterns.allegro.products.Product;
import com.kodilla.good.patterns.allegro.user.User;

import java.util.List;

public interface Basket {


    User getUser();

    List<Product> getProductList();

    void addProductToList(Product product);

    void removeProductFromList(int listIndex);

    boolean isBasketEmpty();

}
