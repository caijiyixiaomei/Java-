package com.itheima.stringdemo;

public class StringDemo13 {
    public static void main(String[] args) {
        //获取到说的话
        String talk = "你玩的真好，下次别玩了，TMD, CNM！";

        //定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        //循环得到数组中的每一个敏感词，一次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        //打印结果
        System.out.println(talk);
    }
}



