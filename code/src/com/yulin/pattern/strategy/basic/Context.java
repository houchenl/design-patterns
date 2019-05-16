package com.yulin.pattern.strategy.basic;

public class Context {

    private StrategyInterface strategy;

    public Context(StrategyInterface strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }

}