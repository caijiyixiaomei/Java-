package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo5 {
    public static void main(String[] args) {
        double sum = 0;
        double count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月数：");
        int m = sc.nextInt();
        System.out.println("请输入每个月小项数：");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.println("第" + i + "个月：");
            for (int j = 1; j <= n; j++) {
                System.out.println("请输入第" + i + "个月第" + j + "小项的数值：");
                double number = sc.nextInt();
                sum += number;
            }
        }
        count += sum;
        System.out.println(count);
    }
}



