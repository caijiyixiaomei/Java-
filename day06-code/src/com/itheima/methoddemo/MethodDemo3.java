package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        //定义一个方法，在方法内部定义两个变量。求出他们的和并进行打印。
        sum();
    }

    public static void sum(){
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }
}
