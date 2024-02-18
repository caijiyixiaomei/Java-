package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0

        sb.append("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijkmnopqrstuvwxyz");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
