package com.javaex.ex06;

public class Goods {
    private String name;
    private int price;
    private static int count;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
        plusCount();
    }


    private void plusCount () {
        count++;
    }


    public int getCount() {
        return count;
    }

}
