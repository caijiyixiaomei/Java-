package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //ctrl+alt+m自动抽取方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入头等舱或经济舱：");
        String cang = sc.nextLine();
        price = getPrice(month, price, cang);
        System.out.println(price);
    }

    public static double getPrice(int month, double price, String cang) {
        if (month >= 5 && month <= 10) {
            price = getPrice(price, cang, 0.9, 0.85);
        } else if (month == 11 || month == 12 || (month >= 1 && month <= 4)) {
            price = getPrice(price, cang, 0.7, 0.65);
        }else {
            System.out.println("键盘录入的月份不合法。");
        }
        return price;
    }


    public static double getPrice(double price, String cang, double v0, double v1){
        if (cang.equals("头等舱")) {
            price *= v0;
        } else if (cang.equals("经济舱")) {
            price *= v1;
        }
        return price;
    }
}
