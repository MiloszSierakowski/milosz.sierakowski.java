package com.kodilla.good.patterns.challenges.allegro.basket;

import com.kodilla.good.patterns.challenges.allegro.User;
import com.kodilla.good.patterns.challenges.allegro.products.Product;

import java.util.List;

public class BasketValidation implements OrderValidation {
    public boolean permissionToMakeOrder(User user, List<Product> productList) {
        return !user.getName().isEmpty() && !productList.isEmpty();
    }
}
