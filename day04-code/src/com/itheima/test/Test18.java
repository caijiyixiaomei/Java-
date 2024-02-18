package com.itheima.test;

public class Test18 {
    public static void main(String[] args) {
        //回文数
        int x = 121;
        //记录原来的x的值，用于比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;
        while(x != 0){
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取的值拼接到最右边
            num = num * 10 + ge;
        }
        System.out.println(num);
        //比较
        System.out.println(num == temp);
    }
}
