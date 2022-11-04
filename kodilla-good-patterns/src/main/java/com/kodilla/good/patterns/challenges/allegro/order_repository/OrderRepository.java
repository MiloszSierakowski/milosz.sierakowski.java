package com.kodilla.good.patterns.challenges.allegro.order_repository;

import com.kodilla.good.patterns.challenges.allegro.User;
import com.kodilla.good.patterns.challenges.allegro.products.Product;

import java.util.List;

public interface OrderRepository {
    void createOrder(User user, List<Product> productList);
}
