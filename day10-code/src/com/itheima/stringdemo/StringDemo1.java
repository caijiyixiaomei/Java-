package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        char[] chs = {'a', 'b', 'c', 'd'};
        String s1 = new String(chs);
        System.out.println(chs);
        System.out.println(s1);

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        byte[] bytes = {97, 98, 99, 100};
        String s2 = new String(bytes);
        System.out.println(s2);
    }
}
