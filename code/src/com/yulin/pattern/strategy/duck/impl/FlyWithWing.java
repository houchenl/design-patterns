package com.yulin.pattern.strategy.duck.impl;

import com.yulin.pattern.strategy.duck.FlyStrategy;

public class FlyWithWing implements FlyStrategy {

    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }

}
