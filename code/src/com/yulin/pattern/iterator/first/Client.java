package com.yulin.pattern.iterator.first;

public class Client {

    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("小刚");
        ag.add("小红");
        ag.add("小明");
        ag.add("小梅");
        Iterator iterator = ag.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
