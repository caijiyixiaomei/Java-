package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的周长：");
        int r = sc.nextInt();
        S(r);
    }

    public static void S(double r1){
        double result = 3.14 * r1 * r1;
        System.out.println(result);
    }
}
