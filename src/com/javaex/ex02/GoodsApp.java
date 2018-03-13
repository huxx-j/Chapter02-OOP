package com.javaex.ex02;

public class GoodsApp {
    public static void main(String[] args) {

        Goods laptop = new Goods();
        Goods cup = new Goods();

        laptop.setName("LG그램");
        laptop.setPrice(900000);

        cup.setName("머그컵");
        cup.setPrice(2000);

        laptop.showInfo();
        cup.showInfo();

//        System.out.println("-상품이름 : " + laptop.getName() + ", 가격 : " + laptop.getPrice());
//        System.out.println("-상품이름 : " + cup.getName() + ", 가격 : " + cup.getPrice());

    }
}
