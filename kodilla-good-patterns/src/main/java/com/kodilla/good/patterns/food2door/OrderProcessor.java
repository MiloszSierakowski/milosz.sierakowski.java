package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.producer.Producer;

public class OrderProcessor {


    public OrderDto process(OrderRequest orderRequest) {
        Producer producer = orderRequest.getProducer();



        return new OrderDto();
    }
}
