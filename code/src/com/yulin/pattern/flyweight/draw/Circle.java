package com.yulin.pattern.flyweight.draw;

public class Circle implements Flyweight {

    private String color;  // 内部状态

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个圆，颜色为" + color);
    }

}
