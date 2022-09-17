package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;


class WeatherForecastTestSuite {

    private Temperatures temperaturesMock;

    private Map<String, Double> temperaturesMap;

    @BeforeEach
    void before() {
        System.out.println("Test Case: start");
        temperaturesMock = mock(Temperatures.class);
        temperaturesMap = new HashMap<>();
    }

    @AfterEach
    void after(){
        System.out.println("Test Case: end");
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature(){
        temperaturesMap.put("Rzeszow", 10.0);
        temperaturesMap.put("Krakow", 20.0);
        temperaturesMap.put("Wroclaw", 30.0);
        temperaturesMap.put("Warszawa", 40.0);
        temperaturesMap.put("Gdansk", 50.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double averageTemp = weatherForecast.averageTemperature();

        assertEquals(30.0,averageTemp);
    }


    @Test
    void testMedianTemperatureEvenNumberOfElements(){
        temperaturesMap.put("Rzeszow", 10.0);
        temperaturesMap.put("Krakow", 20.0);
        temperaturesMap.put("Wroclaw", 30.0);
        temperaturesMap.put("Warszawa", 40.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double MedianTemp = weatherForecast.averageTemperature();

        assertEquals(25.0,MedianTemp);
    }

    @Test
    void testMedianTemperatureOddNumberOfElements(){
        temperaturesMap.put("Rzeszow", 10.0);
        temperaturesMap.put("Krakow", 20.0);
        temperaturesMap.put("Wroclaw", 30.0);
        temperaturesMap.put("Warszawa", 40.0);
        temperaturesMap.put("Gdansk", 50.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        double MedianTemp = weatherForecast.averageTemperature();

        assertEquals(30.0,MedianTemp);
    }
}