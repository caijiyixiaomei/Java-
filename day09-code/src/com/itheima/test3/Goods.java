package com.itheima.test3;

public class Goods {
    //定义数组存储3个商品对象。
    //商品的属性：商品的id，名字，价格，库存。
    //创建三个商品对，并把商品对象存入到数组当中
    private String id;
    private String name;
    private double price;
    private int count;


    public Goods() {
    }

    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }
}
