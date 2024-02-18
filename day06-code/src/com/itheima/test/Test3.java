package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第1个长方形的长和宽：");
        int number1 =sc.nextInt();
        int number2 =sc.nextInt();
        System.out.print("第2个长方形的长和宽：");
        int number3 =sc.nextInt();
        int number4 =sc.nextInt();
        double result = Square(number1, number2) > Square(number3, number4) ? Square(number1, number2) : Square(number3, number4);
        System.out.println(result);
    }



    public static double Square(int a, int b){
        int S = a * b;
        return S;
    }
}
