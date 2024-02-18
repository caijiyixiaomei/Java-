package com.itheima.test6;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个数组
        Phone[] arr = new Phone[3];


        //创建手机对象
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 4999, "蓝色");
        Phone p3 = new Phone("魅族", 3999, "红色");

        //把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        //求平均值
        //int avg = sum / 3;
        double avg1 = sum * 1.0 / 3;

        System.out.println(avg1);

    }
}
