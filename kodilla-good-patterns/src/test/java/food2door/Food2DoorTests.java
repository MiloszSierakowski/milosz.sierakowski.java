package food2door;

import com.kodilla.good.patterns.food2door.CompanyNames;
import com.kodilla.good.patterns.food2door.OrderProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Food2DoorTests {

    private final OrderProcessor orderProcessor = new OrderProcessor();

    @Test
    void extraFoodShopProcessTest(){
        assertEquals("Sprzedaja extra jedzenie",orderProcessor.orderRequest(CompanyNames.EXTRAFOODSHOP));
    }

    @Test
    void glutenFreeShopProcessTest(){
        assertEquals("Sprzedaje jedzenie bez glutenu....",orderProcessor.orderRequest(CompanyNames.GLUTENFREESHOP));
    }

    @Test
    void healthyShopProcessTest(){
        assertEquals("Sprzedaje witaminy???",orderProcessor.orderRequest(CompanyNames.HEALTHYSHOP));
    }
}
