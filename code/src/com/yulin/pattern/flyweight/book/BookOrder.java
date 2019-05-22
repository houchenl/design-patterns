package com.yulin.pattern.flyweight.book;

public class BookOrder implements FlyWeight {

    private String name;

    public BookOrder(String name) {
        this.name = name;
    }

    @Override
    public void sell() {
        System.out.println("卖了一本书，书名为" + this.name);
    }

}
