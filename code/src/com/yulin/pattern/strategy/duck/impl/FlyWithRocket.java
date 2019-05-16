package com.yulin.pattern.strategy.duck.impl;

import com.yulin.pattern.strategy.duck.FlyStrategy;

public class FlyWithRocket implements FlyStrategy {

    @Override
    public void performFly() {
        System.out.println("用火箭飞行");
    }

}
