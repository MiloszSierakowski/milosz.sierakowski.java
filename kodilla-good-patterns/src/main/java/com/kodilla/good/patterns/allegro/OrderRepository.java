package com.kodilla.good.patterns.allegro;

import com.kodilla.good.patterns.allegro.products.Product;

import java.util.List;

public interface OrderRepository {
    void createOrder(User user, List<Product> productList);
}
