package com.yulin.pattern.prototype.object;

import java.util.ArrayList;

public class ConcretePrototype extends Prototype {

    private String name;
    private int age;
    private ArrayList<String> favors = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        // super.clone()是浅拷贝
        // 拷贝引用需要单独处理
        ConcretePrototype prototype = (ConcretePrototype) super.clone();
        prototype.favors = (ArrayList<String>) this.favors.clone();
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getFavors() {
        return favors;
    }

    public void setFavors(ArrayList<String> favors) {
        this.favors = favors;
    }

    public void show() {
        String message =  "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favors=" + favors.toString() +
                '}';
        System.out.println(message);
    }

}
