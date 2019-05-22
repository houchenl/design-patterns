package com.yulin.pattern.prototype.object;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原始对象
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(23);
        concretePrototype.setName("jack");
        ArrayList<String> favors = new ArrayList<>();
        favors.add("football");
        favors.add("movie");
        favors.add("food");
        concretePrototype.setFavors(favors);

        // 克隆
        ConcretePrototype prototype = (ConcretePrototype) concretePrototype.clone();
        prototype.setAge(25);
        prototype.getFavors().add("novel");
        prototype.show();

        concretePrototype.show();
    }

}
