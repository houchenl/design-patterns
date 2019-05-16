package com.yulin.pattern.strategy.duck;

import com.yulin.pattern.strategy.duck.impl.FlyWithRocket;

public class SpaceDuck extends Duck {

    public SpaceDuck() {
        setFlyStrategy(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("身穿宇航服");
    }

    @Override
    public void quack() {
        System.out.println("通过无线电通信");
    }

}
