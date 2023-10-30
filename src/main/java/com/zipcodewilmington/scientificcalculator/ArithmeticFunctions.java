package com.zipcodewilmington.scientificcalculator;

public class ArithmeticFunctions {

    public static Double numberSign(Double userNumber) {
        return -userNumber;
    }

    public static Double addNumbers(Double number1, Double number2) {

        return number1 + number2;
    }

    public static Double subtractNumbers(Double number1, Double number2) {
        return number1 - number2;
    }

    public static Double divideNumbers(Double number1, Double number2) {
        Double result = 0.0;
        if (number2 == 0) {
            Console.println("Error cannot divide by zero");
        } else {
            result = number1 / number2;
        }
        return result;
    }

    public static Double multiplyNumbers(Double number1, Double number2) {
        return number1 * number2;
    }

    public static Double squareNumber(Double number) {
        return number * number;
    }

    public static Double squareRootNumber(Double number) {
        return Math.sqrt(number);
    }

    public static Double power(Double number, Double exponent) {
        return Math.pow(number, exponent);
    }

    public static Double inverse(Double number) {
        return 1 / number;
    }

    public static Double factorial(Double userInput) {
        if (userInput == 0) {
            return 1.0;
        }
        else {
            Double result = 1.0;
            for (int i = 1; i < userInput; i++) {
                result = result * (i + 1);
            }
            return result;
        }
    }


}