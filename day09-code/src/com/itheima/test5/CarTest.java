package com.itheima.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建一个数组用来存3个汽车对象
        Car[] arr = new Car[3];

        //创建汽车对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();

            //录入品牌
            System.out.println("请输入汽车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);

            //录入价格
            System.out.println("请输入汽车的价格：");
            int price = sc.nextInt();
            c.setPrice(price);

            //录入颜色
            System.out.println("请输入汽车的颜色：");
            String color = sc.next();
            c.setColor(color);
            
            //放入数组
            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + " , " + car.getPrice() + " , " + car.getColor());
        }
        
        

    }
}
