package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //二维数组的静态初始化
        //数据类型[][] 数组名 = new 数据类型[][] {{元素1，元素2}, {元素1，元素2}}
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
