package com.yulin.pattern.prototype.custom;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        // 创建原始对象
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(23);
        concretePrototype.setName("jack");
        ArrayList<String> favors = new ArrayList<>();
        favors.add("football");
        favors.add("movie");
        favors.add("food");
        concretePrototype.setFavor(favors);

        // 克隆对象
        ConcretePrototype prototype = (ConcretePrototype) concretePrototype.clone();
        prototype.setAge(25);
        prototype.getFavor().add("novel");
        prototype.show();  // ConcretePrototype{age=25, name='jack', favor=[football, movie, food, novel]}

        concretePrototype.show();  // ConcretePrototype{age=23, name='jack', favor=[football, movie, food]}
    }

}
