package com.yulin.pattern.strategy.duck;

import com.yulin.pattern.strategy.duck.impl.FlyNoWay;

public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        setFlyStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("身体很大，全身黄黄");
    }

    @Override
    public void quack() {
        System.out.println("只会游，不会飞");
    }

}
