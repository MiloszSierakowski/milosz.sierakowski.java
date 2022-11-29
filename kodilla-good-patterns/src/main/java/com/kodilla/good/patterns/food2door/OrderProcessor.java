package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producer.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.food2door.producer.Producers;

import java.util.HashMap;

public class OrderProcessor {

    private final HashMap<CompanyNames, Producers> listOfProducers = new HashMap<>();

    public OrderProcessor() {
        listOfProducers.put(CompanyNames.EXTRAFOODSHOP, new ExtraFoodShop());
        listOfProducers.put(CompanyNames.GLUTENFREESHOP, new GlutenFreeShop());
        listOfProducers.put(CompanyNames.HEALTHYSHOP, new HealthyShop());
    }

    public String orderRequest(CompanyNames selectedCompany) {
        return listOfProducers.get(selectedCompany).process();
    }


}
