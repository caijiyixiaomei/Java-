package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //验证码：长度为5，前四位是大写字母或者小写字母，最后一位是数字
        //大写字母和小写字母都存入数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char)(65 + i - 26);
            }
        }
        //随机抽取4次
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(52);
            result += chs[num];
        }
        //System.out.print(result);
        int num2 = r.nextInt(10);
        result += num2;
        System.out.print(result);
    }
}
