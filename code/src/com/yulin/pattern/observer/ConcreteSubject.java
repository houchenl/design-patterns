package com.yulin.pattern.observer;

// 具体主题角色类
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    // 修改状态并通知观察者
    public void change(String state) {
        this.state = state;
        System.out.println("new state is " + state);
        // 状态改变时，通知所有观察者
        notifyObservers(state);  // 第一种通知方式
        notifyObservers();  // 第二种通知方式
    }

}
