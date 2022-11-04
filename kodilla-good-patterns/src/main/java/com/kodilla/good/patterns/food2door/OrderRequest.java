package com.kodilla.good.patterns.food2door;
import com.kodilla.good.patterns.food2door.producer.Producer;
import com.kodilla.good.patterns.food2door.product.Product;

import java.util.List;

public class OrderRequest {
    private final List<Product> productList;
    private final Producer producer;

    public OrderRequest(List<Product> productList, Producer producer) {
        this.productList = productList;
        this.producer = producer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Producer getProducer() {
        return producer;
    }
}
