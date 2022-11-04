package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.basket.Basket;
import com.kodilla.good.patterns.challenges.allegro.basket.BasketValidation;
import com.kodilla.good.patterns.challenges.allegro.information_service.MailService;
import com.kodilla.good.patterns.challenges.allegro.order_repository.UserOrderRepository;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        OrderRequest orderRequest = basket.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new BasketValidation(),
                new MailService(), new UserOrderRepository());
        OrderDto orderDto = productOrderService.order(orderRequest);
    }
}
