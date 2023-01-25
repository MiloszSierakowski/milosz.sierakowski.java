package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaOrderTest {

    @Test
    public void testBasicPizzaOrderGetCost() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        BigDecimal calculatedCost = theOrder.getPrice();
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        String description = theOrder.getDescription();
        assertEquals("Podstawowa pizza ciasto, sos pomidorowy i ser", description);
    }

    @Test
    public void testPizzaWithMeatGetCost() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        BigDecimal theCost = theOrder.getPrice();
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testPizzaWithMeatGetDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        String description = theOrder.getDescription();
        assertEquals("Podstawowa pizza ciasto, sos pomidorowy i ser + dodatkowe mieso", description);
    }

    @Test
    public void testPizzaWithMeatAndCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testPizzaWithMeatAndCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Podstawowa pizza ciasto, sos pomidorowy i ser + dodatkowe mieso + dodatkowy ser", description);
    }

    @Test
    public void testPizzaWithMeatAndCheeseAndVegetablesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testPizzaWithMeatAndCheeseAndVegetablesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Podstawowa pizza ciasto, sos pomidorowy i ser + dodatkowe mieso + dodatkowy ser + dodatowe warzywa", description);
    }

}