package com.kodilla.good.patterns.food2door.repository;

public class GlutenFreeFoodOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder() {
        return true;
    }
}
