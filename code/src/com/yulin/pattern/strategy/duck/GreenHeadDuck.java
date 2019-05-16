package com.yulin.pattern.strategy.duck;

import com.yulin.pattern.strategy.duck.impl.FlyWithWing;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        setFlyStrategy(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }

}
