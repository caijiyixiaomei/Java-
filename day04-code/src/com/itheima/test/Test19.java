package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
        //求商和余数
        int a = 12;
        int b = 5;
        int i;
        for (i = 0; a >= b; i++){
            a = a - b;
        }
        System.out.println(i);
        System.out.println(a);
    }
}
