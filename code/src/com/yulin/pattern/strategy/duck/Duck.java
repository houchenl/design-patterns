package com.yulin.pattern.strategy.duck;

/**
 * 抽象了鸭子的行业：显示和鸣叫
 * */
public abstract class Duck {

    private FlyStrategy flyStrategy;

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    /**
     * 鸣叫
     * 通用行为，由超类实现
     * */
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 显示
     * 鸭子的外观各不相同，声明为abstract，由子类实现
     * */
    public abstract void display();

    public void fly() {
        if (null != flyStrategy) {
            flyStrategy.performFly();
        }
    }

}
