package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Test;

import static com.zipcodewilmington.scientificcalculator.Console.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testAddNumbers() {
        Double number1 = 1.0;
        Double number2 = 2.0;

        Double expected = 3.0;

        assertEquals(expected, addNumbers(number1, number2));


    }

    @Test
    public void testDisplayZero(){
        Console.displayZero();
    }

    @Test
    public void testNumberSign1(){
        Double expected = -5.0;

        assertEquals(expected, numberSign(5.0));
    }

    @Test
    public void testNumberSign2(){
        Double expected = 5.0;

        assertEquals(expected, numberSign(-5.0));
    }
    @Test
    public void testSubtractNumbers(){
        Double number1 = 5.0;
        Double number2 = 2.0;

        Double expected = 3.0;

        assertEquals(expected, subtractNumbers(number1, number2));
    }

    @Test
    public void testMultiplyNumbers(){
        Double number1 = 5.0;
        Double number2 = 2.0;

        Double expected = 10.0;

        assertEquals(expected, multiplyNumbers(number1, number2));
    }

    @Test
    public void testDivideNumbers(){
        Double number1 = 6.0;
        Double number2 = 2.0;

        Double expected = 3.0;

        assertEquals(expected, divideNumbers(number1, number2));
    }

    @Test
    public void testSquareNumber(){
        Double number1 = 5.0;

        Double expected = 25.0;

        assertEquals(expected, squareNumber(number1));
    }

    @Test
    public void testSquareRoot(){
        Double number1 = 25.0;

        Double expected = 5.0;

        assertEquals(expected, squareRootNumber(number1));
    }

    @Test
    public void testPower(){
        Double number1 = 5.0;
        Double number2 = 2.0;

        Double expected = 25.0;

        assertEquals(expected, power(number1, number2));
    }

    @Test
    public void testInverse(){
        Double number1 = 5.0;

        Double expected = 0.20;

        assertEquals(expected, inverse(number1));
    }

    @Test
    public void testSineDegrees(){
        Double number1 = 0.0;

        Double expected = 0.0;

        assertEquals(expected, sine(number1, "degrees"));
    }

    @Test
    public void testSineDegrees2(){
        Double number1 = 90.0;

        Double expected = 1.0;

        assertEquals(expected, sine(number1, "degrees"));
    }

    @Test
    public void testSineRadians(){
        Double number1 = Math.PI;

        Double expected = 0.0;

        assertEquals(expected, sine(number1, "radians"));
    }

    @Test
    public void testSineRadians2(){
        Double number1 = Math.PI / 2;

        Double expected = 1.0;

        assertEquals(expected, sine(number1, "radians"));
    }






}
