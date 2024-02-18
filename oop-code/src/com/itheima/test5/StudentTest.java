package com.itheima.test5;

import com.itheima.test2.GirlFriend;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
        //Student s = new Student();
        Student s = new Student("zhangsan", 23);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
