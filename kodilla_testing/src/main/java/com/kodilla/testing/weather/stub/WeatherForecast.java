package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        double averageTemp = 0;

        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            averageTemp += entry.getValue();
        }

        return averageTemp / temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        double medianTemp = 0;
        Collection<Double> values = temperatures.getTemperatures().values();
        List<Double> listOfValues = new ArrayList<>(values);
        Collections.sort(listOfValues);

        if (listOfValues.size() % 2 == 0) {
            medianTemp = (listOfValues.get(listOfValues.size() / 2) + listOfValues.get((listOfValues.size() / 2) - 1)) / 2;
        } else {
            medianTemp = listOfValues.get(listOfValues.size() / 2);
        }

        return medianTemp;
    }
}