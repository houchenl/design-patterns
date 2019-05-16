package com.yulin.pattern.strategy.duck.impl;

import com.yulin.pattern.strategy.duck.FlyStrategy;

public class FlyNoWay implements FlyStrategy {

    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }

}
