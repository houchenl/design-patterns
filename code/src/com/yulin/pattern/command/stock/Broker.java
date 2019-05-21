package com.yulin.pattern.command.stock;

import java.util.ArrayList;
import java.util.List;

// 执行命令类
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void placeOrders() {
        for (Order order : this.orders) {
            order.execute();
        }
        this.orders.clear();
    }

}
