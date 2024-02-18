package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int count = 0;
        int num = 12345;
        while (num != 0){
            num = num / 10;
            count++;
        }
        int[] arr1 = getNum1(count);
        int[] arr2 = getNum2(arr1);
        int[] arr3 = getReversed(arr2);
        int number = 0;
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        for (int i = 0; i < arr3.length; i++) {
                number = number * 10 + arr3[i];
        }
        System.out.println(number);
    }


    public static int[] getReversed(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }


    private static int[] getNum2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
            //System.out.println(arr[i]);
        }
        return arr;
    }


    public static int[] getNum1(int count) {
        int[] arr = new int[count];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            if (num > 0 && num <= 9) {
                arr[i] = num;
            }
        }
        return arr;
    }
}
