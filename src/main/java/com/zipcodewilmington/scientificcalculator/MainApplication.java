package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.*;
import static com.zipcodewilmington.scientificcalculator.ArithmeticFunctions.*;
import static com.zipcodewilmington.scientificcalculator.TrigFunctions.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        println("Welcome to my calculator!");
        Double currentNumber = 0.0;
        Double memoryNum = 0.0;
        String mode = "degrees";
        String display = "decimal";

        println("CURRENT NUMBER: %s", currentNumber);
        currentNumber = getDoubleInput("Enter an integer");
        println("CURRENT NUMBER: %s", currentNumber);

        while (true) {
            println("What do you want to do? \n1) Add 2) Subtract 3) Invert 4) Multiply 5) Divide 6) Square \n" +
                    "7) Sqrt 8) Power 9) Inverse 10) sin 11) cos 12) tan 13) asin 14) acos 15) atan \n" +
                    "16) switch (degrees/radians) 17) clear 18) factorial 19) log 20) storage " +
                    "21) recall");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if (Objects.equals(userInput.toLowerCase(), "add")) {
                Double i2 = getDoubleInput("Enter an integer to add");
                currentNumber = addNumbers(currentNumber, i2);
                println("CURRENT NUMBER: %s", currentNumber);
            }
            else if (Objects.equals(userInput.toLowerCase(), "invert")) {
                currentNumber = numberSign(currentNumber);
                println("CURRENT NUMBER: %s", currentNumber);
            }
            else if (Objects.equals(userInput.toLowerCase(), "subtract")) {
                Double i2 = getDoubleInput("Enter a number to subtract: ");
                currentNumber = subtractNumbers(currentNumber, i2);
                println("CURRENT NUMBER: %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "multiply")) {
                Double i2 = getDoubleInput("Enter a number to multiply by: ");
                currentNumber = multiplyNumbers(currentNumber, i2);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "divide")){
                Double i2 = getDoubleInput("Enter a number to divide by: ");
                if (i2 == 0) {
                    println("Error cannot divide by zero");
                    println("CURRENT NUMBER %s", currentNumber);
                } else {
                    currentNumber = divideNumbers(currentNumber, i2);
                    println("CURRENT NUMBER %s", currentNumber);
                }
            }
            else if(Objects.equals(userInput.toLowerCase(), "square")){
                currentNumber = squareNumber(currentNumber);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "sqrt")){
                currentNumber = squareRootNumber(currentNumber);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "power")){
                Double i2 = getDoubleInput("Enter a number to raise to the power by: ");
                currentNumber = power(currentNumber, i2);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "inverse")){
                currentNumber = inverse(currentNumber);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "sin")){
                currentNumber = sine(currentNumber, mode);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "switch")){
                System.out.println("Which mode would you like to switch to? Degrees or radians?: ");
                String newMode = scanner.nextLine();
                mode = switchUnitModes(newMode);
                println("CURRENT NUMBER %s", currentNumber);

            }
            else if (Objects.equals(userInput.toLowerCase(), "clear")) {
                currentNumber = clearScreen();
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "cos")) {
                currentNumber = cosine(currentNumber, mode);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "tan")){
                currentNumber = tangent(currentNumber, mode);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "asin")){
                currentNumber = inSin(currentNumber, mode);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "acos")){
                currentNumber = inCos(currentNumber, mode);
                print("CURRENT NUMBER %s", currentNumber);
            }
            else if (Objects.equals(userInput.toLowerCase(), "storage")) {
                save(currentNumber);
            }
            else if ( Objects.equals(userInput.toLowerCase(), "recall")   ) {
                currentNumber = recall();
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if (Objects.equals(userInput.toLowerCase(), "switch1")){
                switchDisplayMode();
                String newMode = scanner.nextLine();
                display = switchUnitModes(newMode);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "atan")){
                currentNumber = inTan(currentNumber, mode);
                println("CURRENT NUMBER %s", currentNumber);
            }
            else if (Objects.equals(userInput.toLowerCase(), "exit")) {
                break;
            }
        }
    }
}
