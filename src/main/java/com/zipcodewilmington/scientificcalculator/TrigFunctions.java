package com.zipcodewilmington.scientificcalculator;

public class TrigFunctions {

    public static Double sine(Double number, String mode) {
        if (mode.equals("degrees")) {
            return Math.sin(Math.toRadians(number));
        }
        return Math.sin(number);
    }

    public static Double cosine(Double number, String mode){
        if(mode.equals("degrees")){
            if(Math.cos(Math.toRadians(number)) > 0 && Math.cos(Math.toRadians(number)) < Math.pow(6, -17)){
                return 0.0;
            }
            return Math.cos(Math.toRadians(number));
        }

        return Math.cos(number);

    }

    public static Double tangent(Double number, String mode){
        if(mode.equals("degrees")){
            if(Math.abs(Math.tan(Math.toRadians(number))) <= 1 && Math.abs(Math.tan(Math.toRadians(number))) >= .999999) {
                return (double) Math.round(Math.tan(Math.toRadians(number)));
            }
            return Math.tan(Math.toRadians(number));
        }
        if(Math.abs(Math.tan(number)) <= 1 && Math.abs(Math.tan(number)) >= .999999) {
            return (double) Math.round(Math.tan(number));
        }
        if(Math.abs(Math.tan(number)) > 0 && Math.abs(Math.tan(number)) < Math.pow(6, -17)){
            return 0.0;
        }
        return Math.tan(number);
    }

    public static Double inSin(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.asin(number));
        }
        return Math.asin(number);
    }

    public static Double inCos(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.acos(number));
        }
        return Math.acos(number);
    }

    public static Double inTan(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.toDegrees(Math.atan(number));
        }
        return Math.atan(number);
    }


}
