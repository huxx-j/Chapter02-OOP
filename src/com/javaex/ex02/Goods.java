package com.javaex.ex02;

public class Goods {
    private String name;
    private int price;

    public Goods() {

    }

    public Goods (String name) {
        this.name = name;
    }

    public Goods (int price) {
        this.price = price;
    }

    public Goods (String name, int price) {
        this(name);
        this.price = price;
    }

    public void setName (String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPrice (int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public void showInfo() {
        System.out.println("상품정보 : " + name);
        System.out.println("가격 : " + price);
    }
}
