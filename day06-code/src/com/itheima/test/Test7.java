package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {1, 2, 3, 4, 5};
        boolean B = Number(arr, 10);
        System.out.println(B);
    }
    public static boolean Number(int[] arr, int num) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            b = (num == arr[i]);
            if (b) {
                break;
            }
        }
        return b;
    }
}
