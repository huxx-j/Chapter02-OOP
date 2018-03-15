package com.javaex.ex10;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("LColor=" + lineColor + " FColor=" + fillColor + " 반지름=" + radius);

    }

    public Circle(String lineColor, String fillColor, int radius) {
        super(lineColor, fillColor);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
