package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunctions {

    public static Double logarithm(Double userInput) {
        Double log = Math.log10(userInput);
        return log;
    }

    public static Double inverseLogarithm (Double userInput){
        Double inverseLog = Math.pow(10, userInput);
        return inverseLog;
    }

    public static Double naturalLogarithm(Double userInput) {
        Double natLog = Math.log(userInput);
        return natLog;
    }

    public static Double inverseNaturalLogarithm(Double userInput) {
        Double inverseNatLog = Math.exp(userInput);
        return inverseNatLog;
    }
}
