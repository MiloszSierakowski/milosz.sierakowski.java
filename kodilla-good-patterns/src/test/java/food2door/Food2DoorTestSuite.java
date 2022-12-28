package food2door;

import com.kodilla.good.patterns.food2door.*;
import com.kodilla.good.patterns.food2door.information.service.SmsService;
import com.kodilla.good.patterns.food2door.repository.FoodOrderRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Food2DoorTestSuite {

    @Test
    void healthyShopOrderTest(){
        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new FoodOrderRepository());

        OrderRequest orderRequest = new OrderRequest(
                new User("Milosz", "Sierakowski", LocalDate.of(1991, 9, 8)),
                CompanyNames.HEALTHYSHOP, "Health Burger", 10);

        OrderDto orderDto = orderProcessor.process(orderRequest);

        assertTrue(orderDto.isOrdered());
    }

    @Test
    void glutenFreeShopOrderTest(){
        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new FoodOrderRepository());

        OrderRequest orderRequest = new OrderRequest(
                new User("Milosz", "Sierakowski", LocalDate.of(1991, 9, 8)),
                CompanyNames.GLUTENFREESHOP, "Gluten Free Fries", 10);

        OrderDto orderDto = orderProcessor.process(orderRequest);

        assertTrue(orderDto.isOrdered());
    }

    @Test
    void extraFoodShopOrderTest(){
        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new FoodOrderRepository());

        OrderRequest orderRequest = new OrderRequest(
                new User("Milosz", "Sierakowski", LocalDate.of(1991, 9, 8)),
                CompanyNames.EXTRAFOODSHOP, "Extra Fries", 10);

        OrderDto orderDto = orderProcessor.process(orderRequest);

        assertTrue(orderDto.isOrdered());
    }

}
