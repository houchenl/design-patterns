package com.yulin.pattern.flyweight.draw;

import java.util.HashMap;
import java.util.Map;

public enum ShapeFactory {

    instance;

    private Map<String, Flyweight> shapes = new HashMap<>();

    public Flyweight add(String color) {
        Flyweight shape = this.shapes.get(color);
        if (shape == null) {
            shape = new Circle(color);
            this.shapes.put(color, shape);
        }
        return shape;
    }

    public int getCount() {
        return this.shapes.size();
    }

}
