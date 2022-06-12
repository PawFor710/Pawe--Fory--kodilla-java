package com.kodilla.testing.weather.stub;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateMean() {
        Map<String, Double> resultMap = new HashMap<>();
        double sumOfTemperatures = 0;
        double quantityOfData = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue());
            sumOfTemperatures += temperature.getValue();
        }
        quantityOfData = resultMap.size();
        double result = sumOfTemperatures/quantityOfData;
        return result;
    }
    public double calculateMedian() {
        Map<String, Double> resultMap = new HashMap<>();
        double median = 0;
        double mean = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());

            List<Double> valuesOfTemperature = new ArrayList<>(resultMap.values());
            sort(valuesOfTemperature);
            if(resultMap.size() % 2 != 0) {
                median = valuesOfTemperature.get(valuesOfTemperature.size()/2);
            } else {
                mean = valuesOfTemperature.get(valuesOfTemperature.size()/2) +
                        valuesOfTemperature.get(valuesOfTemperature.size()/2);
                median = mean/2;
            }
        }
        return median;
    }
}
