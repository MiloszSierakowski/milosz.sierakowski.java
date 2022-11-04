package com.kodilla.good.patterns.challenges.allegro.basket;

import com.kodilla.good.patterns.challenges.allegro.User;
import com.kodilla.good.patterns.challenges.allegro.products.Product;

import java.util.List;

public interface OrderValidation {
    boolean permissionToMakeOrder(User user, List<Product> productList);
}
