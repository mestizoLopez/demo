package com.myschool.demo.utils;

public class UtilsClass {

    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }

}
