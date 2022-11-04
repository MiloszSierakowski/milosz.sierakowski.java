package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.basket.OrderValidation;
import com.kodilla.good.patterns.challenges.allegro.information_service.InformationService;
import com.kodilla.good.patterns.challenges.allegro.order_repository.OrderRepository;

public class ProductOrderService {
    private final OrderValidation orderValidation;
    private final InformationService informationService;
    private final OrderRepository orderRepository;

    public ProductOrderService(OrderValidation orderValidation, InformationService orderInformation,
                               OrderRepository orderRepository) {
        this.orderValidation = orderValidation;
        this.informationService = orderInformation;
        this.orderRepository = orderRepository;
    }

    public OrderDto order(OrderRequest orderRequest) {
        boolean isPermissionToMakeOrder = orderValidation.permissionToMakeOrder(orderRequest.user(), orderRequest.productList());

        if (isPermissionToMakeOrder) {
            informationService.inform(orderRequest.user());
            orderRepository.createOrder(orderRequest.user(), orderRequest.productList());
            return new OrderDto(orderRequest.user(), true);
        } else {
            return new OrderDto(orderRequest.user(), false);
        }
    }
}
