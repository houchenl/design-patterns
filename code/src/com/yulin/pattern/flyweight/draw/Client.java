package com.yulin.pattern.flyweight.draw;

public class Client {

    public static void main(String[] args) {
        addColor("红色");
        addColor("黄色");
        addColor("蓝色");
        addColor("红色");
        addColor("黄色");
        addColor("蓝色");
        addColor("红色");
        addColor("黄色");
        addColor("蓝色");
        addColor("红色");
        addColor("黄色");
        addColor("蓝色");

        System.out.println(ShapeFactory.instance.getCount());
    }

    private static void addColor(String color) {
        ShapeFactory.instance.add(color).draw();
    }

}
