package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一支老虎的重量：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第一支老虎的重量：");
        int weight2 = sc.nextInt();
        System.out.println(weight1 == weight2 ? "相同" :"不同");
    }
}
