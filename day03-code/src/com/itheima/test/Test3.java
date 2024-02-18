package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //a = 6   b = 6   (a + b) % 6 == 0
        System.out.println("请输入一个数：");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入第一个数：");
        int b = sc.nextInt();
        System.out.println("请输入第二个数：");
        System.out.println(a == 6 || b == 6 || (a + b) % 6 == 0);
        //boolean result = a == 6 || b == 6 || (a + b) % 6 == 0;
       //System.out.println(result);
    }
}
