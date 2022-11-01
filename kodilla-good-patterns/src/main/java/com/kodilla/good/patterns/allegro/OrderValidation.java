package com.kodilla.good.patterns.allegro;

import com.kodilla.good.patterns.allegro.products.Product;

import java.util.List;

public interface OrderValidation {

    boolean permissionToMakeOrder(User user, List<Product> productList);

}
