package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyArr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }


    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArray = new int[to - from];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[from + i];
        }
        return newArray;

    }
}
