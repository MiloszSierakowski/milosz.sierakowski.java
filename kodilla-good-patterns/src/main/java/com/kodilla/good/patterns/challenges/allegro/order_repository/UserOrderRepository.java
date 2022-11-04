package com.kodilla.good.patterns.challenges.allegro.order_repository;

import com.kodilla.good.patterns.challenges.allegro.User;
import com.kodilla.good.patterns.challenges.allegro.products.Product;

import java.util.List;

public class UserOrderRepository implements OrderRepository {
    public void createOrder(User user, List<Product> productList) {
        System.out.println("Zapisano zamowienie uzytkownika " + user.getName() + " w bazie danych oraz jego koszyk " + productList.toString());
    }
}
