package com.javaex.ex10;

public class ShapeApp {
    public static void main(String[] args) {

//        Triangle[] tArray = new Triangle[3];
//
//        Triangle t01 = new Triangle("yellow","yellow",1,1);
//        Triangle t02 = new Triangle("black","black",4,4);
//        Triangle t03 = new Triangle("pink","pink",6,6);
//
//        tArray[0] = t01;
//        tArray[1] = t02;
//        tArray[2] = t03;
//
//        for (int i = 0; i < tArray.length; i++) {
//            tArray[i].draw();
//        }

//        Rectangle[] rArray = new Rectangle[3];

        Shape[] sArray = new Shape[3];

        Shape s01 = new Rectangle("red","red",3,3);
        Shape s02 = new Triangle("green","green",8,8);
        Shape s03 = new Circle("black","black",10);

        sArray[0] = s01;
        sArray[1] = s02;
        sArray[2] = s03;

        for (int i = 0; i < sArray.length; i++) {
            sArray[i].draw();
            System.out.println(sArray[i].area());
        }

//        Rectangle r01 = new Rectangle("red","red",3,3);
//        Rectangle r02 = new Rectangle("blue","blue",5,5);
//        Rectangle r03 = new Rectangle("green","green",8,8);
//
//
//        rArray[0] = r01;
//        rArray[1] = r02;
//        rArray[2] = r03;
//
//        for (int i = 0; i < rArray.length; i++) {
//            rArray[i].draw();
//        }
//
//        System.out.println(r01);
    }
}
