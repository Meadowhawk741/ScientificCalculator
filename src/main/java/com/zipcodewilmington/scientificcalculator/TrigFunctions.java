package com.zipcodewilmington.scientificcalculator;

public class TrigFunctions {

    public static Double sine(Double number, String mode) {
        if (mode.equals("degrees")) {
            return Math.sin(Math.toRadians(number));
        }
        return (double) (Math.round(Math.sin(number) * 100) / 100);
    }

    public static Double cosine(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.cos(Math.toRadians(number));
        }
        return Math.round(Math.cos(number) * 100d) / 100d;
    }

    public static Double tangent(Double number, String mode){
        if(mode.equals("degrees")){
            return Math.tan(Math.toRadians(number));
        }
        return (double) (Math.round(Math.tan(number) * 100) / 100);
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
