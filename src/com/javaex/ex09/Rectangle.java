package com.javaex.ex09;

public class Rectangle {
    private String lineColor;
    private String fillColor;
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(String lineColor, String fillColor, int height, int width) {
        this.lineColor = lineColor;
        this.fillColor = fillColor;
        this.height = height;
        this.width = width;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void draw() {
        System.out.println("LColor=" + lineColor + " FColor=" + fillColor + " 가로=" + width + " 세로=" + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lineColor='" + lineColor + '\'' +
                ", fillColor='" + fillColor + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
