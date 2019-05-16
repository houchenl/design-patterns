package com.yulin.pattern.strategy.duck;

import com.yulin.pattern.strategy.duck.impl.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("全身发黄，嘴巴很红");
    }

    @Override
    public void quack() {
        System.out.println("嘎~嘎~嘎~");
    }

}
