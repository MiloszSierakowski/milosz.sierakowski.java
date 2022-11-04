package com.kodilla.good.patterns.food2door;

public class Main {
    public static void main(String[] args) {
        User user = new User("Milosz");
        OrderRequest orderRequest = user.makeOrder();
    }
}
