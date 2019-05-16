package com.yulin.pattern.strategy.duck;

import com.yulin.pattern.strategy.duck.impl.FlyWithWing;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        setFlyStrategy(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是红色的");
    }

}
