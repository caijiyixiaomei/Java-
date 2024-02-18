package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("输入第二个数字：");
        int number2 = sc.nextInt();
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

