package com.kodilla.good.patterns.allegro;

import com.kodilla.good.patterns.allegro.products.Product;

import java.util.List;

public class UserOrderRepository implements OrderRepository {
    public void createOrder(User user, List<Product> productList) {
        System.out.println("Zapisano zamowienie urzytkownika " + user.getName() + " w bazie danych i jego koszyk " + productList.toString());
    }
}
