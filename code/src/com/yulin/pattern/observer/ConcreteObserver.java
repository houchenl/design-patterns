package com.yulin.pattern.observer;

public class ConcreteObserver implements Observer {

    // 观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        observerState = state;
        System.out.println("observer state change to " + state);
    }

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject) subject).getState();
        System.out.println("observer state change to " + observerState);
    }

}
