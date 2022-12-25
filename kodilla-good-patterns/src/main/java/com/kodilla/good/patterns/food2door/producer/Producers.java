package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.OrderRequest;

public interface Producers {
    boolean process(OrderRequest orderRequest);

}
