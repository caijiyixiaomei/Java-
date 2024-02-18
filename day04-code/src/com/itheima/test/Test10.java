package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //键盘录入星期数，输出工作日，休息日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("不合法");
        }
    }
}
