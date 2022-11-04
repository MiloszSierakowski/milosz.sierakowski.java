package com.kodilla.good.patterns.challenges.allegro.basket;

import com.kodilla.good.patterns.challenges.allegro.OrderRequest;
import com.kodilla.good.patterns.challenges.allegro.User;
import com.kodilla.good.patterns.challenges.allegro.products.Game;
import com.kodilla.good.patterns.challenges.allegro.products.Product;
import com.kodilla.good.patterns.challenges.allegro.products.Toys;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public OrderRequest retrieve() {
        User user = new User("Milosz");

        List<Product> productList = new ArrayList<>();

        productList.add(new Game("GTA V", 2, 1));
        productList.add(new Toys("Teddy bear", 10, 3));

        return new OrderRequest(user, productList);

    }

}
