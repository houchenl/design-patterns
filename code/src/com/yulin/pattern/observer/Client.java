package com.yulin.pattern.observer;

// 客户端
public class Client {

    public static void main(String[] args) {
        // 创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者对象
        ConcreteObserver observer = new ConcreteObserver();
        // 将观察者对象注册到主题对象上
        subject.attach(observer);
        // 改变主题对象的状态
        subject.change("new state");
    }

}
