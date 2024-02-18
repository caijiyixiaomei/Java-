package com.itheima.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长和宽：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Length(a, b);
    }

    public static void Length(int number1, int number2) {
        int sum = 2 * (number1 + number2);
        System.out.println(sum);
    }
}
