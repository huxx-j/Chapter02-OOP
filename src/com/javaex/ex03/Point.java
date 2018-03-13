package com.javaex.ex03;

public class Point {
    private int x;
    private int y;

//    public Point(){}

//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }


    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw() {
        System.out.println("점 [x=" + x +", y=" + y + "]을 그렸습니다.");
    }

    public void draw(int x, int y) {
        System.out.println("점 [x=" + x + ", y=" + y + "]을 지웠습니다.");
    }
}
