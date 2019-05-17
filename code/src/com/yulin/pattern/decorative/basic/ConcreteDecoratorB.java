package com.yulin.pattern.decorative.basic;

public class ConcreteDecoratorB extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {

    }

}
