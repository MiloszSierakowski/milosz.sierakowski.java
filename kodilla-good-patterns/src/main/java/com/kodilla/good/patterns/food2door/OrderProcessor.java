package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.information.service.InformationService;
import com.kodilla.good.patterns.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producer.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.food2door.producer.Producers;
import com.kodilla.good.patterns.food2door.repository.OrderRepository;

import java.util.HashMap;

public class OrderProcessor {
    private final HashMap<CompanyNames, Producers> listOfProducers = new HashMap<>();
    private final InformationService informationService;
    private final OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        listOfProducers.put(CompanyNames.EXTRAFOODSHOP, new ExtraFoodShop());
        listOfProducers.put(CompanyNames.GLUTENFREESHOP, new GlutenFreeShop());
        listOfProducers.put(CompanyNames.HEALTHYSHOP, new HealthyShop());
    }

    private boolean isProducerAcceptOrder(OrderRequest orderRequest) {
        return listOfProducers.get(orderRequest.getSelectedCompany()).process(orderRequest);
    }

    public OrderDto process(OrderRequest orderRequest){
        if (isProducerAcceptOrder(orderRequest)){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder();
            return new OrderDto(orderRequest.getUser().getName(),true);
        }else {
            return new OrderDto(orderRequest.getUser().getName(),false);
        }

    }
}
