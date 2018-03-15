package com.javaex.ex10;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    @Override
    public double area() {
        return width * height;
    }

    public Rectangle(String lineColor, String fillColor, int width, int height) {
        super(lineColor, fillColor);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("LColor=" + lineColor + " FColor=" + fillColor + " 가로=" + width + " 세로=" + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", lineColor='" + lineColor + '\'' +
                ", fillColor='" + fillColor + '\'' +
                "} ";
    }
}
