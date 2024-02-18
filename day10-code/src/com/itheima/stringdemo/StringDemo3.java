package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //键盘录入abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();//abc 是new出来的

        //代码中再定义一个字符串abc
        String str2 = "abc";

        //用==比较，这两者能一样吗？
        System.out.println(str1 == str2);
    }
}

//结论：以后只要想比较字符串的内容，就必须要用String里面的方法