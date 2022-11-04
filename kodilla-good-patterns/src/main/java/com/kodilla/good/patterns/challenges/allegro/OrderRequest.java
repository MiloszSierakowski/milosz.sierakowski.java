package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.products.Product;

import java.util.List;

public record OrderRequest(User user, List<Product> productList) {
}
