package com.kodilla.good.patterns.allegro.products;

public class Toys implements Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Toys(String name, double price, int quantity) {
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
