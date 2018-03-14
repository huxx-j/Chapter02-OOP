package com.javaex.ex03;

public class Point {
    //필드
    private int x;
    private int y;

    //생성자
    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //메소드
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
