package com.zipcodewilmington.scientificcalculator;

public class UniqueFunctions {

    public static Double convertFtoC(Double userInput) {
        Double celcius = ((userInput-32.0)*5)/9;
        return celcius;
    }
    public static Double convertCtoF(Double userInput) {
        Double fahrenheit = ((userInput*9)/5)+32;
        return fahrenheit;
    }

}
