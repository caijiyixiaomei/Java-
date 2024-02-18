package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //获取到说的话
        String talk = "你玩的真好，下次别玩了，TMD！";

        //把里面的敏感词替换成***
        String result = talk.replace("TMD", "***");

        //打印结果
        System.out.println(result);
    }
}
