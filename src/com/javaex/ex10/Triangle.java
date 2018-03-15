package com.javaex.ex10;

public class Triangle extends Shape{
    private int width;
    private int height;

    public Triangle() {
    }

    @Override
    public double area() {
        return width * height / 0.5;
    }

    public Triangle(String lineColor, String fillColor, int width, int height) {
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
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", lineColor='" + lineColor + '\'' +
                ", fillColor='" + fillColor + '\'' +
                "} " + super.toString();
    }
}
