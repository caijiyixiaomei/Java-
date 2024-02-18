package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //定义一个字符串记录身份证号码
        String id = "321281202001011234";

        //获取年份
        String year = id.substring(6, 10);

        //获取月份
        String month = id.substring(10, 12);

        //获取日
        String day = id.substring(12,14);

        System.out.println(year + "出生年" + month + "月" + day + "日");

        //判断性别
        char c = id.charAt(16);
        int num = c - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
