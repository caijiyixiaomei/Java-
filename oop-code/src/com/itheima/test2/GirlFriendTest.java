package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.sleep();
        gf1.eat();

        System.out.println("======================");

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("小丹丹");
        gf2.setAge(19);
        gf2.setGender("女");

        System.out.println(gf2.getName());
        System.out.println(gf2.getGender());
        System.out.println(gf2.getAge());

        gf2.sleep();
        gf2.eat();

    }
}
