package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.information.service.SmsService;
import com.kodilla.good.patterns.food2door.repository.FoodOrderRepository;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new FoodOrderRepository());

        OrderRequest orderRequest = new OrderRequest(
                new User("Milosz", "Sierakowski", LocalDate.of(1991, 9, 8)),
                CompanyNames.HEALTHYSHOP, "Health Burger", 10);

        OrderDto orderDto = orderProcessor.process(orderRequest);

        System.out.println("\n " + orderDto);
    }
}
