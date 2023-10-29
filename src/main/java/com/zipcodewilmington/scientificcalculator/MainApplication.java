package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Double currentNumber = 0.0;
        Double memoryNum = 0.0;
        String mode = "degrees";
        String display = "decimal";

        Console.println("CURRENT NUMBER: %s", currentNumber);

//        String s = Console.getStringInput("Enter a string");
        currentNumber = Console.getDoubleInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");

//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a double", d);
        Console.println("CURRENT NUMBER: %s", currentNumber);

        while (true) {
            Console.println("What do you want to do? 1) Add 2) Subtract 3) Invert 4) Multiply 5) Divide 6) Square " +
                    "8) Sqrt 9) Power 10) Inverse");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (Objects.equals(userInput.toLowerCase(), "add")) {
                Double i2 = Console.getDoubleInput("Enter an integer to add");
                currentNumber = addNumbers(currentNumber, i2);
                Console.println("CURRENT NUMBER: %s", currentNumber);
            } else if (Objects.equals(userInput.toLowerCase(), "invert")) {
                currentNumber = numberSign(currentNumber);
                Console.println("CURRENT NUMBER: %s", currentNumber);
            }
            else if (Objects.equals(userInput.toLowerCase(), "subtract")) {
                Double i2 = Console.getDoubleInput("Enter a number to subtract: ");
                currentNumber = subtractNumbers(currentNumber, i2);
                Console.println("CURRENT NUMBER: %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "multiply")) {
                Double i2 = Console.getDoubleInput("Enter a number to multiply by: ");
                currentNumber = multiplyNumbers(currentNumber, i2);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "divide")){
                Double i2 = Console.getDoubleInput("Enter a number to divide by: ");
                if (i2 == 0) {
                    Console.println("Error cannot divide by zero");
                    Console.println("CURRENT NUMBER %s", currentNumber);
                } else {
                    currentNumber = divideNumbers(currentNumber, i2);
                    Console.println("CURRENT NUMBER %s", currentNumber);
                }
            }
            else if(Objects.equals(userInput.toLowerCase(), "square")){
                currentNumber = Console.squareNumber(currentNumber);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "sqrt")){
                currentNumber = squareRootNumber(currentNumber);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "power")){
                Double i2 = Console.getDoubleInput("Enter a number to raise to the power by: ");
                currentNumber = power(currentNumber, i2);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "inverse")){
                currentNumber = inverse(currentNumber);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "sine")){
                currentNumber = sine(currentNumber, mode);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }
            else if(Objects.equals(userInput.toLowerCase(), "switch")){
                System.out.println("Which mode would you like to switch to? Degrees or radians?: ");
                String newMode = scanner.nextLine();
                mode = switchUnitModes(newMode);
                Console.println("CURRENT NUMBER %s", currentNumber);

            }else if (Objects.equals(userInput, "Clear")) {
                currentNumber = clearScreen();
                Console.println("CURRENT NUMBER %s", currentNumber);
            }else if(Objects.equals(userInput.toLowerCase(), "cosine")) {
                currentNumber = cosine(currentNumber, mode);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }else if (Objects.equals(userInput, "storage")) {
                Save(currentNumber);
            }else if ( Objects.equals(userInput, "recall")   ) {
                currentNumber = recall();
                Console.println("CURRENT NUMBER %s", currentNumber);
            } else if (Objects.equals(userInput, "switch1")){
                switchDisplayMode();
                String newMode = scanner.nextLine();
                display = switchUnitModes(newMode);
                Console.println("CURRENT NUMBER %s", currentNumber);
            }else if (Objects.equals(userInput.toLowerCase(), "exit")) {
                break;
            }
        }
    }
}
