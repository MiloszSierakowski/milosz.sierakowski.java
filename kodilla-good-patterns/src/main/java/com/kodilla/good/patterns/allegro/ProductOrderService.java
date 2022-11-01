package com.kodilla.good.patterns.allegro;

public class ProductOrderService {
    private OrderValidation orderValidation;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final OrderValidation orderValidation,
                               final InformationService orderInformation,
                               final OrderRepository orderRepository) {
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
