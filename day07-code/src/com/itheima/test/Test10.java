package com.itheima.test;
import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        //抽奖，{2，588，888，1000，10000}，随机且不重复
        getPrize();
    }
    public static void getPrize() {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        int count = 0;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(5);
            for (int j = 0; j < arr1.length; j++) {
                if (arr[num] == arr1[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                arr1[num] = arr[num];
                System.out.println(arr[num] + "元的奖金被抽出！");
                i++;
            }
            count = 0;
        }
    }
}
