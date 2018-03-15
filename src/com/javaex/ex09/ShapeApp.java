package com.javaex.ex09;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle[] rArray = new Rectangle[3];

        Rectangle r01 = new Rectangle("red","red",3,3);
        Rectangle r02 = new Rectangle("blue","blue",5,5);
        Rectangle r03 = new Rectangle("green","green",8,8);

        rArray[0] = r01;
        rArray[1] = r02;
        rArray[2] = r03;

        for (int i = 0; i < rArray.length; i++) {
            rArray[i].draw();
        }


        Triangle[] tArray = new Triangle[3];
        //Triangle[] 배열에는 String, int 형 말고 Triangle만 넣을수 있음

        Triangle t01 = new Triangle("red","red",3,3);
        Triangle t02 = new Triangle("blue","blue",5,5);
        Triangle t03 = new Triangle("green","green",8,8);

        tArray[0] = t01;
        tArray[1] = t02;
        tArray[2] = t03;

        for (int i = 0; i < tArray.length; i++) {
            tArray[i].draw();
        }

        tArray[0].draw();
        tArray[1].draw();
        tArray[2].draw();

//        System.out.println(t01);
//        System.out.println(t02.toString());

        t01.draw();
        t02.draw();
        t03.draw();
    }
}
