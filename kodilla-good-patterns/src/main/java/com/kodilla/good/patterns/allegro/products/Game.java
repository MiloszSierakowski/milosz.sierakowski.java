package com.kodilla.good.patterns.allegro.products;

public class Game implements Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Game(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
