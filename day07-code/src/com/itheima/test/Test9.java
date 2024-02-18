package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //抽奖，{2，588，888，1000，10000}，随机且不重复

        //1.把奖池里的奖金打乱顺序
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //打乱顺序
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }


        //遍历奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        }
    }
