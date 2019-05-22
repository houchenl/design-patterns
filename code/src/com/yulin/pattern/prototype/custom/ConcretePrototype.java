package com.yulin.pattern.prototype.custom;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype implements Prototype {

    private int age;
    private String name;
    private ArrayList<String> favor = new ArrayList<>();

    @Override
    public Object clone() {
        ConcretePrototype object = new ConcretePrototype();
        object.age = this.getAge();
        object.name = this.getName();
//        object.favor = this.favor;  // 浅复制
        object.favor = (ArrayList<String>) this.favor.clone();  // 深复制
        return object;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFavor() {
        return favor;
    }

    public void setFavor(ArrayList<String> favor) {
        this.favor = favor;
    }

    public void show() {
        String message =  "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favor=" + favor.toString() +
                '}';
        System.out.println(message);
    }

}
