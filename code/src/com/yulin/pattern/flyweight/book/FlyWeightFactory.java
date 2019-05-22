package com.yulin.pattern.flyweight.book;

import java.util.HashMap;
import java.util.Map;

public enum FlyWeightFactory {

    instance;

    private Map<String, FlyWeight> books = new HashMap<>();

    public FlyWeight addOrder(String bookName) {
        FlyWeight order = null;
        if (books.containsKey(bookName)) {
            order = books.get(bookName);
        } else {
            order = new BookOrder(bookName);
            this.books.put(bookName, order);
        }
        return order;
    }

    public int getOrderCount() {
        return this.books.size();
    }

}
