package com.yulin.pattern.flyweight.book;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static List<FlyWeight> orders = new ArrayList<>();

    public static void main(String[] args) {
        takeOrder("三国演义");
        takeOrder("水浒传");
        takeOrder("封神榜");
        takeOrder("三体");
        takeOrder("红楼梦");
        takeOrder("三国演义");
        takeOrder("封神榜");
        takeOrder("水浒传");

        for (FlyWeight order : orders) {
            order.sell();
        }

        System.out.println("一共买了" + orders.size() + "本书");
        System.out.println("共生成了" + FlyWeightFactory.instance.getOrderCount() + "个对象");
    }

    private static void takeOrder(String bookName) {
        orders.add(FlyWeightFactory.instance.addOrder(bookName));
    }

}
