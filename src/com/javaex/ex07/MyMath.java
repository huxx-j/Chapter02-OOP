package com.javaex.ex07;

public class MyMath {

    private static final double PI = 3.14;

    public static int plus (int a, int b) {
        return a + b;
    }

    public static double plus (double a, double b) {
        return a + b;

    }

    public static double area (int radius) {
        return radius*radius*PI;
    }
}
