package com.zipcodewilmington.scientificcalculator;

import java.lang.management.MemoryManagerMXBean;
import java.nio.file.attribute.UserPrincipal;
import java.awt.*;
import java.util.Scanner;

import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    static double storage;

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    /*public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {

        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }*/

    public static Double getDoubleInput(String prompt) {

        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }

    // add


    public static void displayZero () {
        int displayZero = 0;
        System.out.println(displayZero);

    }

    public static void switchUnitModes() {
        System.out.println("Modes: Degrees, Radians");
    }

    public static String switchUnitModes(String mode) {
        if (mode.equalsIgnoreCase("degrees")) {
            System.out.println("Your new mode: Degrees");
            return "degrees";
        }
        else {
            // just have it default to radians
            System.out.println("Your new mode: Radians");
            return "radians";
        }
    }

    //------------------------------------------------------
    public static void switchLogarithmicFunctions() {
        System.out.println("Modes: Logarithmic Functions, Factorials");
    }

    public static String switchFactorials(String mode) {
        if (mode.equals("Logarithmic Functions")) {
            return "logarithmic functions";
        } else if (mode.equals("Factorials")) {
            return "factorials";
        }
        return null;
    } //------------------------------------------------


    public static void switchDisplayMode() {
        System.out.println("Modes: binary, octal,decimal,hexadecimal");
    }

    public static void switchDisplayMode( String mode){
        System.out.println( "currentNumber");
    }

    public static double clearScreen() {
        System.out.flush();
        return 0.0;
    }

    public static void save(double Number) {
        storage = Number;
        System.out.println(storage);
    }

    public static double recall() {
        return storage;

    }


}

