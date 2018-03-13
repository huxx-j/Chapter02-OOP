package com.javaex.ex03;

public class PointApp {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point();

        point1.setPoint(5, 5);
        point2.setPoint(10,23);

        point1.draw();
        point2.draw();
        point1.draw(point1.getX(),point1.getY());
        point2.draw(point2.getX(),point2.getY());
    }

}
