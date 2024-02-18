package com.itheima.test1;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999.98;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
