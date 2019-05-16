package com.yulin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类
 * 持有观察者对象，并通知观察者对象
 * */
public abstract class Subject {

    // 保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    // 注册观察者
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("attached an observer.");
    }

    // 删除观察者对象
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("detached an observer.");
    }

    // 通知所有注册的观察者
    // 主题类通知观察者时，有两种方式：一种是直接把所有数据告诉观察者；另一个是通知观察者事件和少量数据，观察者如果需要更具体数据可从
    // 主题类获取，这种方式一般会在通知方法中把主题类对象的引用告诉观察者
    public void notifyObservers(String state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    // 第二种通知方式
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
