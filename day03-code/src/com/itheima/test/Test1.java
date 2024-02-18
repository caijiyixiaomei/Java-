package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //获取个位，十位，百位
        System.out.println(number % 10);
        System.out.println(number / 10 % 10);
        System.out.println(number / 100 % 10);
    }
}
