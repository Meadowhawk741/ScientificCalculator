package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Test;

import static com.zipcodewilmington.scientificcalculator.Console.*;
import static com.zipcodewilmington.scientificcalculator.ArithmeticFunctions.*;
import static com.zipcodewilmington.scientificcalculator.LogarithmicFunctions.*;
import static com.zipcodewilmington.scientificcalculator.TrigFunctions.*;
import static com.zipcodewilmington.scientificcalculator.UniqueFunctions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    // Please someone save me from trig testing hell :((((((((
    @Test
    public void testSineRadians(){
        Double number1 = 0.0;

        Double expected = 0.0;

        assertEquals(expected, sine(number1, "radians"));
    }

    @Test
    public void testSineRadians2(){
        Double number1 = Math.PI / 2;

        Double expected = 1.0;

        assertEquals(expected, sine(number1, "radians"));
    }

     @Test
    public void testCosineDegrees(){
        Double number1 = 0.0;

        Double expected = 1.0;

        assertEquals(expected, cosine(number1, "degrees"));
    }

    @Test
    public void testCosineDegrees2(){
        Double number1 = 180.0;

        Double expected = -1.0;

        assertEquals(expected, cosine(number1, "degrees"));
    }

    @Test
    public void testCosineRadians(){
        Double number = 0.0;

        Double expected = 1.0;

        assertEquals(expected, cosine(number, "radians"));
    }

    @Test
    public void testCosineRadians2(){
        Double number = Math.PI;

        Double expected = -1.0;

        assertEquals(expected, cosine(number,"radians"));
    }

    @Test
    public void testTangentDegree(){
        Double number = 0.0;

        Double expected = 0.0;

        assertEquals(expected, tangent(number, "degrees"));
    }

    @Test
    public void testTangentDegrees2(){
        Double number = 45.0;

        Double expected = 1.0;

        assertEquals(expected, tangent(number, "degrees"));

    }

    @Test
    public void testTangentRadians(){
        Double number = Math.PI;

        Double expected = 0.0;

        assertEquals(expected, tangent(number, "radians"));
    }

    @Test
    public void testTangentRadians2(){
        Double number = Math.PI / 4;

        Double expected = 1.0;

        assertEquals(expected, tangent(number, "radians"));
    }

    @Test
    public void testSwitchUnitModes(){
        String newMode = "radians";

        String expected = "radians";

        assertEquals(expected, switchUnitModes(newMode));
    }

    @Test
    public void testSwitchUnitModes2(){
        String newMode = "degrees";

        String expected = "degrees";

        assertEquals(expected, switchUnitModes(newMode));
    }

    @Test
    public void testInverseSinDegrees(){
        Double number = 0.0;

        Double expected = 0.0;

        assertEquals(expected, inSin(number, "degrees"));
    }

    @Test
    public void testInverseSinDegrees2(){
        Double number = 1.0;

        Double expected = 90.0;

        assertEquals(expected, inSin(number, "degrees"));
    }

    @Test
    public void testInverseSinRadians(){
        Double number = -Math.PI / 2;

        assertTrue(Double.isNaN(inSin(number, "radians")));

    }

    @Test
    public void testInverseSinRadians2(){
        Double number = 0.0;

        Double expected = 0.0;

        assertEquals(expected, inSin(number, "radians"));

    }
    @Test
    public void divideNumbers_byZero(){
        Double expected = 0.0;

        assertEquals(expected, divideNumbers(5.0, 0.0));
    }

    @Test
    public void factorialTest() {
        Double expected = 120.0;

        assertEquals(expected, factorial(5.0));
    }

    @Test
    public void factorialTest_Zero() {
        Double expected = 1.0;

        assertEquals(expected, factorial(0.0));
    }

    @Test
    public void testFtoC() {
        Double expected1 = 10.0;
        assertEquals(expected1, convertFtoC(50.0));

        Double expected2 = 0.0;
        assertEquals(expected2, convertFtoC(32.0));
    }

    @Test
    public void testCtoF() {
        Double expected1 = 68.0;
        assertEquals(expected1, convertCtoF(20.0));

        Double expected2 = 95.0;
        assertEquals(expected2, convertCtoF(35.0));
    }

    @Test
    public void testLog() {
        Double expected = 1.0;
        assertEquals(expected, logarithm(10.0));
    }

    @Test
    public void testInverseLog() {
        Double expected = 10.0;
        assertEquals(expected, inverseLogarithm(1.0));
    }

    @Test
    public void testNaturalLog() {
        Double expected = 0.6931471805599453;
        assertEquals(expected, naturalLogarithm(2.0));
    }

    @Test
    public void testInverseNaturalLog() {
        Double expected = 2.7182818284590455;
        assertEquals(expected, inverseNaturalLogarithm(1.0));
    }
    @Test
    public void testInverseCosDegrees(){
        Double number = 0.0;

        Double expected = 90.0;

        assertEquals(expected, inCos(number, "degrees"));
    }

    @Test
    public void testInverseCosDegrees2(){
        Double number = 1.0;

        Double expected = 0.0;

        assertEquals(expected, inCos(number, "degrees"));
    }

    @Test
    public void testInverseCosRadians(){
        Double number = 1.0;

        Double expected = 0.0;

        assertEquals(expected, inCos(number, "radians"));
    }

    @Test
    public void testInverseCodRadians2(){
        Double number = -1.0;

        Double expected = Math.PI;

        assertEquals(expected, inCos(number, "radians"));
    }

    @Test
    public void testInverseTanDegrees(){
        Double number = 1.0;

        Double expected = 45.0;

        assertEquals(expected, inTan(number, "degrees"));
    }

    @Test
    public void testInverseTanDegrees2(){
        Double number = 0.0;

        Double expected = 0.0;

        assertEquals(expected, inTan(number, "degrees"));
    }

    @Test
    public void testInverseTanRadians(){
        Double number = 0.0;

        Double expected = 0.0;

        assertEquals(expected, inTan(number, "radians"));
    }

    @Test
    public void testInverseTanRadians2(){
        Double number = 1.0;

        Double expected = Math.PI / 4;

        assertEquals(expected, inTan(number, "radians"));
    }

}
