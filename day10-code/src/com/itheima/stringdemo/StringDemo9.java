package com.itheima.stringdemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //键盘录入一个金额
        int money;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效！");
            }
        }

        //定义一个变量用来表示钱的大写
        String moneyStr = "";

        //得到money中的每一位数字
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            money = money / 10;
            moneyStr = capitalNumber + moneyStr;
            if (money == 0) {
                break;
            }
        }

        //在前面补0，补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        //插入单位
        //定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.print(result);
    }

    //定义一个方法把数字变成大写的中文
    public static String getCapitalNumber(int number) {
        //定义数组，让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
